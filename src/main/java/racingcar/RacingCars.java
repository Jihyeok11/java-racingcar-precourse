package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {

    public static List readyCars(String StringInput) {

        List<String> playerList = Arrays.asList(StringInput.split(","));
        List<Car> playerCars = new ArrayList<>();
        for (int i = 0; i < playerList.size(); i++) {
            if (playerList.get(i).length() > 5) {
                return null;
            }
            Car car = new Car(playerList.get(i));
            playerCars.add(car);
        }
        return playerCars;
    }
}