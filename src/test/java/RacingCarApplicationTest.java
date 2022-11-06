import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarApplicationTest {
    @Test
//     void 테스트1() throws IOException {
//        String[] strings1 = {"안녕, 친구들"}, strings2 = {"1, 2, 3, 4, 5"}, strings3 = {" "},
//                strings4 = {"123, 1241324,  , 2"}, strings5 = {"123, 123,  ,2"}, strings6 = {" , , 123321, , "};
//
//        System.out.println("strings1");
//        RacingCarApplication.main(strings1);
//        System.out.println("strings2");
//        RacingCarApplication.main(strings2);
//        System.out.println("strings3");
//        RacingCarApplication.main(strings3);
//        System.out.println("strings4");
//        RacingCarApplication.main(strings4);
//        System.out.println("strings5");
//        RacingCarApplication.main(strings5);
//        System.out.println("strings6");
//        RacingCarApplication.main(strings6);
//
//    }
    @TestFactory
    List<DynamicTest> 테스트() {
        String[] strings1 = {"안녕, 친구들"}, strings2 = {"1, 2, 3, 4, 5"}, strings3 = {" "},
                strings4 = {"123, 1241324,  , 2"}, strings5 = {"123, 123,  ,2"}, strings6 = {" , , 123321, , "};

        return List.of(
                DynamicTest.dynamicTest("테스트1 이름", () -> {
                    RacingCarApplication.main(strings1); }
                ),
                DynamicTest.dynamicTest("테스트2 이름", () -> {
                    RacingCarApplication.main(strings2);
                }),
                DynamicTest.dynamicTest("테스트3 이름", () -> {
                    RacingCarApplication.main(strings3);
                }),
                DynamicTest.dynamicTest("테스트4 이름", () -> {
                    RacingCarApplication.main(strings4); }
                ),
                DynamicTest.dynamicTest("테스트5 이름", () -> {
                    RacingCarApplication.main(strings5);
                }),
                DynamicTest.dynamicTest("테스트6 이름", () -> {
                    RacingCarApplication.main(strings6);
                })
        );
    }
}
