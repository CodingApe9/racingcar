import domain.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public final class RacingCarApplication {
    public static void main(String[] args) throws Exception {
//        BufferedReader brForInputName = new BufferedReader(new InputStreamReader(System.in));

        //자동차 이름 검증 및 리스트로 변환
        CarListCreate carList = new CarListCreate();
        List<String> carNameList = carList.createList("aa,bb,cc,dd");

        //car 찍어내기
        List<Car> cars = CarFactory.producingCars(carNameList);

        StartRacing race = new StartRacing();
        //새로운 룰 정의
        Rule rule = new Rule("5", "0", "9", (i)->i>5);
        List<String> result = race.run(cars, rule);
        race.ParsePrintResult(result, cars.size(), rule.getCarMovingNum());
    }
}

