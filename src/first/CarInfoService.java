package first;

public interface CarInfoService {
    // в соответствии с принципом одной ответственности выносим метод в отдельный класс
    // в соответствии с принципом открытости/закрытости преобразуем класс в интерфейс и имплеменитуем отдельные
    // сервисы информации по типу кузова автомобиля (sedan, crossover, universal)
    public void getCarInterestInfo();
}
