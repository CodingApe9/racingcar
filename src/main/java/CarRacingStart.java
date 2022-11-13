import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CarRacingStart {
    public static void run(List<Car> cars, int NumberOfAttempts){
        int i=1;
        while (NumberOfAttempts-->0){
            System.out.println((i++)+"번째 시도");
            for (Car car: cars){
                car.forwarding(Rand.r(0, 9));
                car.printLocation();
            }
            System.out.println();
        }

        int maxLoc = cars.stream()
                .map((car) -> car.getLocation())
                .max((a, b) -> Math.max(a, b)).get();

        List<Car> WinCars = cars.stream().filter((car) ->
                        car.getLocation()==maxLoc).collect(Collectors.toList());

        System.out.println("최종 우승자!");
        WinCars.stream().forEach((car) -> System.out.println(car));

        System.out.println("축하합니다! 경기 종료.");
    }
}
