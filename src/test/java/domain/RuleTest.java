package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class RuleTest {
    Rule service;

    @Test
    @DisplayName("차량 이동 횟수는 1 이상의 수로 들어와야한다.")
    void test1(){
        var exception = catchThrowable(() ->
                service = new Rule("-1", "0", "9", (n) -> n>4));

        //숫자가 1이하로 들어오면 예외 발생
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("차량 이동 횟수는 숫자로 들어와야 한다.")
    void test2(){
        var exception = catchThrowable(() ->
                service = new Rule("asd", "0", "9", (n) -> n>4));

        //문자가 들어오면 예외 발생
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
    }
}
