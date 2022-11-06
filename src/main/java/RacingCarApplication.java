import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public final class RacingCarApplication {
    public static void main(String[] args) throws Exception {
//        System.out.println("Hello " + Arrays.toString(args));

//        BufferedReader brForInputName = new BufferedReader(new InputStreamReader(System.in));
        CarListCreate carList = new CarListCreate();
        List<String> carNameList = carList.createList(args[0]);

        System.out.println(carNameList);
    }
}

