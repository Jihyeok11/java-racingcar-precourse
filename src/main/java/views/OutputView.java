package views;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void winner(List<Car> carList) {
        System.out.print("최종 우승자: ");
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
        System.out.println(Winners);

    }

    public static void checkGo(int ok, Car car) {
        if (ok > 4) {
            car.go();
        }
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
