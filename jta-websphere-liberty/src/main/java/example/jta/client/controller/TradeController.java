package example.jta.client.controller;

import example.jta.client.service.TradeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeController {

  @Autowired
  private TradeService service;

  private static final Logger logger = LoggerFactory.getLogger(TradeController.class);

  @RequestMapping(value = "/", method = RequestMethod.GET)
  @ResponseBody
  public String defaultMapping() {
    return "TradeController invoked successfully";
  }

  @RequestMapping(value = "/geodetest1/{tradeId}", method = RequestMethod.GET)
  @ResponseBody
  public String runGeodeTest1(@PathVariable() String tradeId) {
    return this.service.runGeodeTest1(tradeId);
  }

  @RequestMapping(value = "/createtrades/{numEntries}", method = RequestMethod.GET)
  @ResponseBody
  public String createTrades(@PathVariable() int numEntries) {
    iterateAndCreateTrades(numEntries);
    return "completed";
  }

  // Note: This iteration is here instead of the TradeService because a transaction is not attempted
  // in the case where a non-transactional method calls a transactional one in the same class.
  private void iterateAndCreateTrades(int numEntries) {
    logger.info("Creating {} trades", numEntries);
    long start=0, end=0;
    start = System.currentTimeMillis();
    for (int i=0; i<numEntries; i++) {
      logger.info("About to create trade={}", i);
      this.service.createTrade(i);
      logger.info("Created trade={}", i);
    }
    end = System.currentTimeMillis();
    logger.info("Created {} trades in {} ms", numEntries, end-start);
  }

  @RequestMapping(value = "/geodetest2/{tradeId}", method = RequestMethod.GET)
  @ResponseBody
  public String runGeodeTest2(@PathVariable() String tradeId) {
    return this.service.runGeodeTest2(tradeId);
  }

  @RequestMapping(value = "/jpatest1/{tradeId}", method = RequestMethod.GET)
  @ResponseBody
  public String runDatabaseTest1(@PathVariable() String tradeId) {
    return this.service.runJpaTest1(tradeId);
  }

  @RequestMapping(value = "/jpatest2/{tradeId}", method = RequestMethod.GET)
  @ResponseBody
  public String runDatabaseTest2(@PathVariable() String tradeId) {
    return this.service.runJpaTest2(tradeId);
  }
}
