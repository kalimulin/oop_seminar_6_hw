public class NotificationService {
    // в соответствии с принципом одной ответственности выносим метод в отдельный класс
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            // send email with JavaMailSenderAPI
        }
    }
}
