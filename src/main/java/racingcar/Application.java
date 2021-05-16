package racingcar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String stringInput = scanner.next();
        RacingCars.readyCars(stringInput);
        System.out.println("시도할 회수는 몇회인가요?");
        int count = scanner.nextInt();
        System.out.println(count);
        // TODO 구현 진행
    }
}
