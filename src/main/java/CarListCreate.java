import java.util.*;

public class CarListCreate {
    /**
     * @param inputNameString 차 이름 스트링 ", "로 구분
     * @return 차 이름 스트링 리스트
     */
    public List<String> createList(String inputNameString) throws Exception {
        List<String> carNameList = List.of(inputNameString.split(", "));

        if (!isCollectCarName(inputNameString, carNameList)){
            throw new Exception("ㅎㅎ 범인 나오세요");
        }
        return carNameList;
    }

    /**
     * @param inputNameString 입력받은 스트링
     * @param names ", "로 변환한 리스트
     * @return
     */
    private boolean isCollectCarName(String inputNameString, List<String> names){
        Set<String> carNameCount = new HashSet<>(names);

        if (carNameCount.size() != names.size()){
            System.out.println("자동차 이름 중복");
            return false;
        }
        //오류 방출
        for (String carName : names) {
            if (carName.contains(" ")) {
                System.out.println("자동차 이름 중 공백이 포함되어 있습니다.");
                return false;
            }
            if (carName.length() > 5 || carName.length() < 1) {
                System.out.println("자동차 이름 길이가 너무 길거나 짧습니다.");
                return false;
            }
            // TODO : 중복된 자동차 이름 찾기, 쉼표의 개수+1와 자동차 이름의 개수가 맞아야한다.
        }

        if (inputNameString.chars().filter(i -> i==',').count()+1!=carNameCount.size()) {
            System.out.println("쉼표 개수와 자동차 개수가 맞지 않음");
            return false;
        }
        return true;
    }
}
