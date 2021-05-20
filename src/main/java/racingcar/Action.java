package racingcar;

import views.OutputView;

import java.util.List;

public class Action {

    public static void racing(int num, List<Car> carList) {
        for (int i = 0; i < num; i++) {
            System.out.println("실행 결과");
            for (Object car : carList) {
                int ok = utils.RandomUtils.nextInt(0, 9);
                OutputView.CheckGo(ok, (Car) car);
            }
            System.out.println();
        }
        OutputView.Winner(carList);
    }

}

