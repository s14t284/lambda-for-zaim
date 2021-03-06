package lambdaForZaim.model;

import java.util.Map;
import lombok.Data;

@Data
public class Money {
  private int total;
  private Map<String, Integer> amountForCategory;

  public Money() {
  }

  public Money(int total, Map<String, Integer> amountForCategory) {
    this.total = total;
    this.amountForCategory = amountForCategory;
  }

  public String toStringForCategory() {
    String str = "";
    for (Map.Entry<String, Integer> entry: getAmountForCategory().entrySet()) {
      str += "\n" + entry.getKey() + ":\t" + entry.getValue();
    }
    return str;
  }
}
