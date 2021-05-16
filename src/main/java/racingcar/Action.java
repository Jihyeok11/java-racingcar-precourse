package racingcar;

import java.util.List;
import utils.RandomUtils;

public class Action {

    public static void racing(int num, List carList) {
        for (int i = 0; i < num; i++) {
            System.out.println("실행 결과");
            for (int j = 0; j < carList.size(); j++) {
                int ok = RandomUtils.nextInt(0, 9);
                CheckGo(ok, (Car) carList.get(j));
            }
            System.out.println();
        }
        Finish.checkWinner(carList);
    }

    public static void CheckGo(int ok, Car car) {
        if (ok > 4) {
            car.Go();
        }
        System.out.print(car.CarName() + " : " );
        for (int i=0;i<car.GetPosition();i++){
            System.out.print("-");
        }
        System.out.println();
    }
}

