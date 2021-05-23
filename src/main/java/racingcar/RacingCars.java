package racingcar;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RacingCars {

    private static int LIMIT_LENGTH = 5;

    public static List<Car> readyCars(String StringInput) {

        String[] playerList = StringInput.split(",");
        List<Car> playerCars;
        playerCars = new ArrayList<>();
        for (String str : playerList) {
            if (str.length() > LIMIT_LENGTH) {
                throw new IllegalArgumentException("[ERROR] 플레이어의 이름은 "+LIMIT_LENGTH+"글자 이하여야 한다.");
            }
            Car car = new Car(str);
            playerCars.add(car);

        }
        return playerCars;
    }
}