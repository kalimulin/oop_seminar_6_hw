package first;

public class EmailNotification implements NotificationService {
    // в соответствии с принципом открытости/закрытости создаем отдельный класс для отправки email и имплементируем
    // интерфейс сервиса сообщений
    @Override
    public void sendMessage(String message) {
        // send email
    }
}
