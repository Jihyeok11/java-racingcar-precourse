package views;

import java.util.Scanner;

public class InputView {

    public static String Start(Scanner scanner) {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return scanner.next();
    }

    public static void Try() {
        System.out.println("시도할 회수는 몇회인가요?");
    }
}
