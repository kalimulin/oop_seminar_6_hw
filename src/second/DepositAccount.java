package second;

import java.math.BigDecimal;

public class DepositAccount extends Account {
    // в соответствии с принципом подстановки Лисков удаляем метод, который не поддерживается данным классом
    @Override
    public BigDecimal balance(String numberAccount) {
        // logic
        return null;
    }

    @Override
    public void refill(String numberAccount, BigDecimal sum) {
        // logic
    }
}
