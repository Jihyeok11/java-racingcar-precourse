package racingcar;

import views.ErrorView;
import views.InputView;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);


        String stringInput = InputView.Start(scanner);
        List<Car> carList = RacingCars.readyCars(stringInput);
        if (carList == null) {
            ErrorView.Exceedfive();
        }
        InputView.Try();
        try {
            int count = scanner.nextInt();
            Action.racing(count, carList);
        } catch (InputMismatchException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
