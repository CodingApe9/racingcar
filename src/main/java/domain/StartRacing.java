package domain;

import infrastructure.Rand;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StartRacing {
    public List<String> run(List<Car> cars, Rule rule) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < rule.getCarMovingNum(); i++) {
            for (Car c : cars) {
                c.go(rule.getPivot().test(Rand.r(rule.getRandStart(), rule.getRandEnd())) ? 1 : 0);
                result.add(c.getCarName()+": "+c.getNowLocation()+" ");
            }
            result.add("\n");
        }

        result.add((cars.stream().filter((c) -> c.getNowLocation() ==
                        cars.stream()
                                .mapToInt(Car::getNowLocation)
                                .max()
                                .getAsInt())
                .collect(Collectors.toList())).toString());
        return result;
    }

    public void ParsePrintResult(List<String> result, int CarsSize, int Times){
        for (int i=0; i<=Times*CarsSize; i++){
            System.out.print(result.get(i));
        }
        System.out.println(result.get(result.size()-1));
    }
}
