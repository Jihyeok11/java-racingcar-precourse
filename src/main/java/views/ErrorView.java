package views;

public class ErrorView {

    public static void exceedfive() {
        System.out.println("[ERROR] 플레이어의 이름은 5글자 이하여야 한다.");
    }

    public static void inputMatchError() {
        System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
    }
}
