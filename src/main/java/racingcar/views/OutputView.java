package racingcar.views;

import java.util.Collections;
import racingcar.elements.Car;
import racingcar.elements.Match;

public class OutputView {

    private OutputView() {
    }

    private static void printCarStatus(Car car) {
        System.out.println(car.getName() + " : " + String.join("", Collections
            .nCopies(car.getPosition(), "-")));
    }

    public static void printCurrentMatchStatus(Match match) {
        for (Car car : match.getCarList()) {
            printCarStatus(car);
        }
    }

    public static void printMatchWinner(Match match) {
        System.out.println("최종 우승자: " + String.join(", ", match.makeWinnerResult()));
    }
}
