package views;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void Winner(List<Car> carList) {
        System.out.print("최종 우승자: ");
        List<String> winnerList = new ArrayList<>();
        int max = 0;
        for (Car car : carList) {
            if (max < car.GetPosition()) {
                max = car.GetPosition();
                winnerList = new ArrayList<>();
                winnerList.add(car.GetName());
            } else if (max == car.GetPosition()) {
                winnerList.add(car.GetName());
            }
        }
        String Winners = String.join(", ", winnerList);
        System.out.println(Winners);

    }

    public static void CheckGo(int ok, Car car) {
        if (ok > 4) {
            car.Go();
        }
        System.out.print(car.GetName() + " : ");
        for (int i = 0; i < car.GetPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
