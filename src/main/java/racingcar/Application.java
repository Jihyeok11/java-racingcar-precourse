package racingcar;

import views.InputView;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);


        String stringInput = InputView.start(scanner);
        List<Car> carList = RacingCars.readyCars(stringInput);
        InputView.asktry();
        try {
            int count = scanner.nextInt();
            Action.racing(count, carList);
        } catch (InputMismatchException e) {
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
