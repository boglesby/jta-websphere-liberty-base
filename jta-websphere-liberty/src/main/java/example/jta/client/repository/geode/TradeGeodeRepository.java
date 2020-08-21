package example.jta.client.repository.geode;

import example.jta.client.domain.Trade;
import org.springframework.data.gemfire.repository.GemfireRepository;

public interface TradeGeodeRepository extends GemfireRepository<Trade, String> {
}
