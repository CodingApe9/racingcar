package domain;

import java.util.*;
import java.util.stream.Collectors;

public class CarListCreate {
    /**
     * @param inputNameString 차 이름 스트링 ", "로 구분
     * @return 차 이름 스트링 리스트(null은 에러)
     */

    public List<String> createList(String inputNameString) {
        List<String> carNameList = parseCarNames(inputNameString);

        if (!isCollectCarName(carNameList))
            throw new IllegalArgumentException("니가 입력을 잘못했다");

        return carNameList;
    }

    private List<String> parseCarNames(String string) {
        long dotCount = string.chars()
                .filter(i -> i == ',')
                .count();

        List<String> nameCount = List.of(string.split(","));

//        if (nameCount.size() == 1 && dotCount == 1)
//            throw new IllegalArgumentException("parsing 실패");
//
//        if (nameCount.size() != 1 && dotCount != nameCount.size() - 1)
//            throw new IllegalArgumentException("parsing 실패");

        if (nameCount.size() < 1 || dotCount != nameCount.size() - 1)
            throw new IllegalArgumentException("parsing 실패");

        return List.of(string.split(","));
    }

    private boolean isCollectCarName(List<String> names) {
        for (var carName : names) {
            if (carName.contains(" ")) {
                System.out.println("자동차 이름 중 공백이 포함되어 있습니다.");
                return false;
            }
            if (carName.length() > 5 || carName.length() < 1) {
                System.out.println("자동차 이름 길이가 너무 길거나 짧습니다. :: " + carName);
                return false;
            }

        }

        if (names.stream().distinct().count() != names.size()){
            System.out.println("중복된 자동차 이름이 있습니다.");
            return false;
        }

        return true;
    }
}
