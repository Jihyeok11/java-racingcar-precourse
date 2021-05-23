package views;

import racingcar.Car;

import java.util.ArrayList;
import java.util.List;

public class OutputView {

    public static void winner(String Winners) {
        System.out.print("최종 우승자: ");
        System.out.println(Winners);
    }

    public static void checkGo(int ok, Car car) {
        if (ok > 4) {
            car.go();
        }
        System.out.print(car.getName() + " : ");
        for (int i = 0; i < car.getPosition(); i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    
    public static void  racingResult(){
        System.out.println("실행 결과");
    }
    public static void enterKey(){
        System.out.println();
    }

}
