package racingcar;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {

    public static List readyCars(String StringInput) {

        String[] playerList = StringInput.split(",");
        List<Car> playerCars = new ArrayList<>();
        for (String str : playerList) {
            if (str.length() > 5) {
                return null;
            }
            Car car = new Car(str);
            playerCars.add(car);
        }
        return playerCars;
    }
}