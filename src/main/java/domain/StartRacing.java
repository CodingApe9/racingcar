package domain;

import infrastructure.Rand;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StartRacing {
    public List<Car> run(List<Car> cars, Rule rule){
        for (int i=0; i<rule.getCarMovingNum(); i++){
            for (Car c: cars){
                c.go(rule.getPivot().test(Rand.r(rule.getRandStart(), rule.getRandEnd()))? 1: 0);
            }
        }

        System.out.println(cars);

        return cars.stream().filter((c) -> c.getNowLocation()==cars.stream()
                .mapToInt(Car::getNowLocation)
                .max()
                .getAsInt()).collect(Collectors.toList());
    }
}
