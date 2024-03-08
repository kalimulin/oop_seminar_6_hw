package second;

import java.math.BigDecimal;

public class PaymentAccount extends Account {
    // в соответствии с принципом подстановки Лисков выделяем метод, который не является общим для всех потомков класса
    // и переносим его в отдельный класс-потомок
    public void payment(String numberAccount, BigDecimal sum) {
        // logic
    }
}
