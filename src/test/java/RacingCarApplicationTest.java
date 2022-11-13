import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RacingCarApplicationTest {
    @TestFactory
    List<DynamicTest> 테스트() {
        String[] strings1 = {"안녕, 친구들", "3"},
                strings2 = {"a, b, c, d, e", "5"},
                strings3 = {"a, b, c, d, e", "5"},
                strings4 = {" ", ""},
                strings5 = {"123, 123,  ,2", "3"},
                strings6 = {" , , 123321, , ", "!"};

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
