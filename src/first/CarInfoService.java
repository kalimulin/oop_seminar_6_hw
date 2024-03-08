package first;

public class CarInfoService {
    // в соответствии с принципом одной ответственности выносим метод в отдельный класс
    public void getCarInterestInfo(String carType) {
        if (carType.equals("sedan")) {
            // do some action
        }
        if (carType.equals("crossover")) {
            // do some action
        }
        if (carType.equals("universal")) {
            // do some action
        }
    }
}
