package domain;

import java.util.function.Predicate;

public class Rule {
    private int carMovingNum;
    private int randStart, randEnd;
    private Predicate<Integer> pivot;

    /**
     * 경기에 적용할 룰을 정의
     * @param carMovingNum 각 자동차가 시도할 전진 횟수
     * @param randStart (a~b)에서 a
     * @param randEnd (a~b)에서 b
     * @param pivot 랜덤한 숫자를 어떤 값을 기준으로 전진할지 정하는 함수형 인터페이스
     */
    public Rule(String carMovingNum, String randStart, String randEnd, Predicate<Integer> pivot) {
        setCarMovingNum(carMovingNum);
        setRandRange(randStart, randEnd);
        this.pivot = pivot;
    }

    private void setCarMovingNum(String carMovingNumString){
        try {
            carMovingNum = isRightCarMovingNum(carMovingNumString);
        } catch (IllegalArgumentException e){
            throw e;
        }
    }

    private int isRightCarMovingNum(String carMovingNumString){
        int carMovingNum;

        try {
            carMovingNum = Integer.parseInt(carMovingNumString);
        }catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }

        if (carMovingNum<1){
            throw new IllegalArgumentException("시도 횟수가 너무 작습니다.");
        }

        return carMovingNum;
    }

    private void setRandRange(String randStart, String randEnd){
        int s, e;
        try {
            s =Integer.parseInt(randStart);
            e = Integer.parseInt(randEnd);
        }catch (IllegalArgumentException e2){
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }

        if (s>=e){
            throw new IllegalArgumentException("랜덤 숫자의 범위가 올바르지 않습니다.");
        }

        this.randStart = s;
        this.randEnd = e;
    }

    public int getCarMovingNum() {
        return carMovingNum;
    }

    public int getRandStart() {
        return randStart;
    }

    public int getRandEnd() {
        return randEnd;
    }

    public Predicate<Integer> getPivot() {
        return pivot;
    }
}
