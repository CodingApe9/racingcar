import java.util.Arrays;
import java.util.List;

public final class RacingCarApplication {
    public static void main(String[] args) throws Exception {
//        BufferedReader brForInputName = new BufferedReader(new InputStreamReader(System.in));

        CarFactory carFactory = new CarFactory();
        List<String> carNameList = carFactory.createList(args[0]);

        CarFactory.SetOriginalNumberOfAttempts(args[1]);
        List<Car> cars = carFactory.createCars(carNameList);

        CarRacingStart.run(cars, CarFactory.getOriginalNumberOfAttempts());
//        System.out.println(carNameList);
//        System.out.println(cars);

    }
}

