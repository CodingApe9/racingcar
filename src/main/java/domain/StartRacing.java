package domain;

import infrastructure.Rand;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StartRacing {

    public Car run(List<Car> cars, Rule rule){
        for (int i=0; i<rule.getCarMovingNum(); i++){
            for (Car c: cars){
                c.go(rule.getPivot().test(Rand.r(rule.getRandStart(), rule.getRandEnd()))? 1: 0);
            }
        }

        return cars.stream()
                .collect(Collectors.maxBy(
                Comparator.comparingInt(Car::getNowLocation)))
                .get();
    }
}
