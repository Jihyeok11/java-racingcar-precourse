package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Finish {

    public static void checkWinner(List<Car> carList) {
        System.out.print("최종 우승자: ");
        List<String> winnerList = new ArrayList<>();
        int max = 0;
        for (Car car : carList) {
            if (max < car.GetPosition()) {
                max = car.GetPosition();
                winnerList = new ArrayList<>();
                winnerList.add(car.CarName());
            } else if (max == car.GetPosition()) {
                winnerList.add(car.CarName());
            }
        }
        String Winners = String.join(", ", winnerList);
        System.out.println(Winners);

    }
}
