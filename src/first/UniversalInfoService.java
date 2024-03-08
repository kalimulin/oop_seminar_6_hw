package first;

public class UniversalInfoService implements CarInfoService {
    // в соответствии с принципом открытости/закрытости ыделили отдельный сервис информации по типу кузова автомобиля
    @Override
    public void getCarInterestInfo() {
        // do some action
    }
}
