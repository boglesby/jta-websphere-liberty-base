package example.jta.client;

import example.jta.client.domain.Trade;
import example.jta.client.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableGemFireAsLastResource;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.geode.boot.autoconfigure.ContinuousQueryAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(exclude = ContinuousQueryAutoConfiguration.class) // disable subscriptions
@ClientCacheApplication(copyOnRead = true)
@EnableEntityDefinedRegions(basePackageClasses = Trade.class)
@EnableGemFireAsLastResource
@EnableTransactionManagement(order = 1)
@EnableGemfireRepositories(basePackages = "example.jta.client.repository.geode")
@EnableJpaRepositories(basePackages = "example.jta.client.repository.jpa")
public class Client extends SpringBootServletInitializer {

  private static final Logger logger = LoggerFactory.getLogger(Client.class);

  @Autowired
  private TradeService tradeService;

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Client.class);
  }

  public static void main(String[] args) {
    SpringApplication.run(Client.class, args);
  }

  @Bean
  ApplicationRunner runner() {
    return args -> {
      loadGetEntries(1);
    };
  }

  private void loadGetEntries(int numEntries) {
    loadEntries(numEntries);
    this.tradeService.getTradesFromJpaRepository(numEntries);
    this.tradeService.getTradesFromGeodeRepository(numEntries);
  }

  private void loadEntries(int numEntries) {
    iterateAndCreateTrades(numEntries);
  }

  // Note: This iteration is here instead of the TradeService because a transaction is not attempted
  // in the case where a non-transactional method calls a transactional one in the same class.
  private void iterateAndCreateTrades(int numEntries) {
    logger.info("Creating {} trades", numEntries);
    long start=0, end=0;
    start = System.currentTimeMillis();
    for (int i=0; i<numEntries; i++) {
      logger.info("About to create trade={}", i);
      this.tradeService.createTrade(i);
      logger.info("Created trade={}", i);
      try {Thread.sleep(50);} catch (Exception e) {}
    }
    end = System.currentTimeMillis();
    logger.info("Created {} trades in {} ms", numEntries, end-start);
  }
}
