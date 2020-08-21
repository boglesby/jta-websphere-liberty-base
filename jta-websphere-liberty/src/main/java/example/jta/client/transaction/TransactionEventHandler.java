package example.jta.client.transaction;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class TransactionEventHandler {

  private static final Logger logger = LoggerFactory.getLogger(TransactionEventHandler.class);

  @TransactionalEventListener(phase = TransactionPhase.BEFORE_COMMIT)
  public void beforeCommit(Object event) {
//    logger.info("Event TransactionPhase.BEFORE_COMMIT: " + event, new Exception());
    logger.info("Event TransactionPhase.BEFORE_COMMIT: " + event);
  }

  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
  public void afterCommit(Object event) {
//    logger.info("Event TransactionPhase.AFTER_COMMIT: " + event, new Exception());
    logger.info("Event TransactionPhase.AFTER_COMMIT: " + event);
  }

  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
  public void afterCompletion(Object event) {
//    logger.info("Event TransactionPhase.AFTER_COMPLETION: " + event, new Exception());
    logger.info("Event TransactionPhase.AFTER_COMPLETION: " + event);
  }

  @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
  public void afterRollback(Object event) {
//    logger.info("Event TransactionPhase.AFTER_ROLLBACK: " + event, new Exception());
    logger.info("Event TransactionPhase.AFTER_ROLLBACK: " + event);
  }
}
