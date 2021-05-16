package racingcar;

import java.util.List;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String stringInput = scanner.next();
        List<Car> carList = RacingCars.readyCars(stringInput);
        if (carList == null) {
            System.out.println("[ERROR] 플레이어의 이름은 5글자 이하여야 한다.");
            return;
        }
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();
        Action.racing(count, carList);
    }
}
