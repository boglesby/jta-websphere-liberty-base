package example.jta.client.service;

import example.jta.client.domain.CusipHelper;
import example.jta.client.domain.Trade;
import example.jta.client.repository.geode.TradeGeodeRepository;
import example.jta.client.repository.jpa.TradeJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.jta.JtaTransactionManager;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

@Service
public class TradeService {

  @Autowired
  private TradeGeodeRepository tradeGeodeRepository;

  @Autowired
  private TradeJpaRepository tradeJpaRepository;

  @Autowired
  PlatformTransactionManager platformTransactionManager;

  @Autowired
  private ApplicationEventPublisher publisher;

  private static final Logger logger = LoggerFactory.getLogger(TradeService.class);

  private static final Random RANDOM = new Random();

  public void dumpTransactionManager() {
    StringBuilder builder = new StringBuilder();
    builder
      .append("platformTransactionManager=")
      .append(this.platformTransactionManager)
      .append("; userTransaction=")
      .append(((JtaTransactionManager) this.platformTransactionManager).getUserTransaction())
      .append("; transactionManager=")
      .append(((JtaTransactionManager) this.platformTransactionManager).getTransactionManager());
    logger.warn("TradeService.dumpTransactionManager " + builder.toString());
  }

  public void getTradesFromGeodeRepository(int numEntries) {
    logger.info("Getting {} trades from Geode repository", numEntries);
    long start=0, end=0;
    start = System.currentTimeMillis();
    for (int i=0; i<numEntries; i++) {
      logger.info("Retrieved Geode trade={}", this.tradeGeodeRepository.findById(String.valueOf(i)));
    }
    end = System.currentTimeMillis();
    logger.info("Retrieved {} trades from Geode repository in {} ms", numEntries, end-start);
  }

  public void getTradesFromJpaRepository(int numEntries) {
    logger.info("Getting {} trades from JPA repository", numEntries);
    long start=0, end=0;
    start = System.currentTimeMillis();
    for (int i=0; i<numEntries; i++) {
      logger.info("Retrieved JPA trade={}", this.tradeJpaRepository.findById(String.valueOf(i)));
    }
    end = System.currentTimeMillis();
    logger.info("Retrieved {} trades from JPA repository in {} ms", numEntries, end-start);
  }

  @Transactional
  public String runGeodeTest1(String tradeId) {
    StringBuilder builder = new StringBuilder();
    builder.append("Geode Test1");
    logger.info("Geode Test1 finding tradeId={}", tradeId);
    Trade trade = this.tradeGeodeRepository.findById(tradeId).orElse(null);
    logger.info("Geode Test1 found trade={}", trade);
    builder.append("\nUpdating trade=").append(trade.toString());
    trade.setPrice(new BigDecimal(BigInteger.valueOf(RANDOM.nextInt(100000)), 2));
    logger.info("Geode Test1 updated trade={}", trade);
    logger.info("Geode Test1 about to sleep for {} milliseconds before committing", 15000);
    try {Thread.sleep(15000);} catch (Exception e) {}
    logger.info("Geode Test1 woke up");
    this.tradeGeodeRepository.save(trade);
    logger.info("Geode Test1 saved trade={}", trade);
    builder.append("\nUpdated trade=").append(trade.toString());
    return builder.toString();
  }

  @Transactional
  public String runGeodeTest2(String tradeId) {
    StringBuilder builder = new StringBuilder();
    builder.append("Geode Test2");
    logger.info("Geode Test2 finding tradeId={}", tradeId);
    Trade trade = this.tradeGeodeRepository.findById(tradeId).orElse(null);
    logger.info("Geode Test2 found trade={}", trade);
    builder.append("\nUpdating trade=").append(trade.toString());
    trade.setPrice(new BigDecimal(BigInteger.valueOf(RANDOM.nextInt(100000)), 2));
    this.tradeGeodeRepository.save(trade);
    logger.info("Geode Test2 saved trade={}", trade);
    builder.append("\nUpdated trade=").append(trade.toString());
    return builder.toString();
  }

  @Transactional
  public String runJpaTest1(String tradeId) {
    StringBuilder builder = new StringBuilder();
    builder.append("JPA Test1");
    logger.info("JPA Test1 finding tradeId={}", tradeId);
    Trade trade = this.tradeJpaRepository.findById(tradeId).orElse(null);
    logger.info("JPA Test1 found trade={}", trade);
    builder.append("\nUpdating trade=").append(trade.toString());
    trade.setPrice(new BigDecimal(BigInteger.valueOf(RANDOM.nextInt(100000)), 2));
    logger.info("JPA Test1 updated trade={}", trade);
    logger.info("JPA Test1 about to sleep for {} milliseconds before committing", 15000);
    try {Thread.sleep(15000);} catch (Exception e) {}
    logger.info("JPA Test1 woke up");
    this.tradeJpaRepository.save(trade);
    logger.info("JPA Test1 saved trade={}", trade);
    builder.append("\nUpdated trade=").append(trade.toString());
    return builder.toString();
  }

  @Transactional
  public String runJpaTest2(String tradeId) {
    StringBuilder builder = new StringBuilder();
    builder.append("JPA Test2");
    logger.info("JPA Test2 finding tradeId={}", tradeId);
    Trade trade = this.tradeJpaRepository.findById(tradeId).orElse(null);
    builder.append("\nUpdating trade=").append(trade.toString());
    logger.info("JPA Test2 found trade={}", trade);
    trade.setPrice(new BigDecimal(BigInteger.valueOf(RANDOM.nextInt(100000)), 2));
    this.tradeJpaRepository.save(trade);
    logger.info("JPA Test2 saved trade={}", trade);
    builder.append("\nUpdated trade=").append(trade.toString());
    return builder.toString();
  }

  @Transactional
  public void createTrade(int index) {
    Trade trade = new Trade(String.valueOf(index), CusipHelper.getCusip(), RANDOM.nextInt(100), new BigDecimal(BigInteger.valueOf(RANDOM.nextInt(100000)), 2));
    this.tradeJpaRepository.save(trade);
    this.tradeGeodeRepository.save(trade);
    this.publisher.publishEvent(trade);
    logger.info("Saved trade={}", trade);
  }
}
