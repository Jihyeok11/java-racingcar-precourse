package racingcar;

import java.util.ArrayList;
import java.util.List;

//    최종 우승자: pobi
//    최종 우승자: pobi, jun
public class Finish {

    public static void checkWinner(List<Car> carList) {
        System.out.print("최종 우승자: ");
        List<String> winnerList = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < carList.size(); i++) {
            if (max < carList.get(i).GetPosition()){
                max = carList.get(i).GetPosition();
                winnerList = new ArrayList<>();
                winnerList.add(carList.get(i).CarName());
            }else if (max == carList.get(i).GetPosition()){
                winnerList.add(carList.get(i).CarName());
            }
        }
        String Winners = String.join(", ",winnerList);
        System.out.println(Winners);

    }
}
