package fourth;

import java.math.BigDecimal;

public interface Payment {
    void doTransaction(BigDecimal amount);
}
