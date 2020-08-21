package example.jta.client.domain;

import org.springframework.data.gemfire.mapping.annotation.Region;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Region("Trades")
public class Trade {

  @javax.persistence.Id
  @org.springframework.data.annotation.Id
  private String id;

  private String cusip;

  private Integer shares;

  private BigDecimal price;

  public Trade() {}

  public Trade(String id, String cusip, Integer shares, BigDecimal price) {
    this.id = id;
    this.cusip = cusip;
    this.shares = shares;
    this.price = price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String toString() {
    return new StringBuilder()
      .append(getClass().getSimpleName())
      .append("[")
      .append("id=")
      .append(id)
      .append("; cusip=")
      .append(cusip)
      .append("; shares=")
      .append(shares)
      .append("; price=")
      .append(price)
      .append("]")
      .toString();
  }
}
