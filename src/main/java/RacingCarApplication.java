import domain.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public final class RacingCarApplication {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello " + Arrays.toString(args));

        BufferedReader brForInputName = new BufferedReader(new InputStreamReader(System.in));
        CarListCreate carList = new CarListCreate();
        List<String> carNameList = carList.createList("aa,bb,dd");

        List<Car> cars = CarFactory.producingCars(carNameList);

        StartRacing race = new StartRacing();
        Rule rule = new Rule("6", "0", "9", (i)->i>4);
        System.out.println("우승 자동차: "+race.run(cars, rule));
    }
}

