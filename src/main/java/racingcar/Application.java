package racingcar;

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
            System.out.println("[ERROR] 플레이어의 이름은 5글자 이하여야 한다.");
            return;
        }
        System.out.println("시도할 회수는 몇회인가요?");
        try {
            int count = scanner.nextInt();
            Action.racing(count, carList);
        } catch (InputMismatchException e) {
            System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
        }
    }
}
