package example.jta.client.repository.jpa;

import example.jta.client.domain.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeJpaRepository extends JpaRepository<Trade, String> {
}
