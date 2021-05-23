package racingcar;

import views.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Action {

    public static void racing(int num, List<Car> carList) {
        for (int i = 0; i < num; i++) {
            OutputView.racingResult();
            for (Car car : carList) {
                int ok = utils.RandomUtils.nextInt(0, 9);
                OutputView.checkGo(ok, car);
            }
            OutputView.enterKey();
        }
        List<String> winnerList = new ArrayList<>();
        int max = 0;
        for (Car car : carList) {
            if (max < car.getPosition()) {
                max = car.getPosition();
                winnerList = new ArrayList<>();
                winnerList.add(car.getName());
            } else if (max == car.getPosition()) {
                winnerList.add(car.getName());
            }
        }
        String Winners = String.join(", ", winnerList);
        OutputView.winner(Winners);

    }

}

