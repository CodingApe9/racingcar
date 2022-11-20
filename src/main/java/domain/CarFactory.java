package domain;

import java.util.List;
import java.util.stream.Collectors;

public class CarFactory {
    public static List<Car> producingCars(List<String> carNames){
        return carNames.stream().map(Car::new).collect(Collectors.toList());
    }
}
