package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingCars {

    public static void readyCars (String StringInput){

        List<String> playerList = Arrays.asList(StringInput.split(","));
        List<Car> playerCars = new ArrayList<>();
        for (int i=0;i<playerList.size(); i++){
            Car car = new Car(playerList.get(i));
            playerCars.add(car);
        }
    }
}
