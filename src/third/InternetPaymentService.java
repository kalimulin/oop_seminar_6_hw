package third;

public class InternetPaymentService implements PhonePayment, CardPayment{
    // в соответствии с принципом разделения интерфейсов имплементируем только нужные интерфейсы
    @Override
    public void payCreditCard() {
        // logic
    }

    @Override
    public void payPhoneNumber() {
        // logic
    }
}
