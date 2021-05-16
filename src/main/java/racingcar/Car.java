package racingcar;

public class Car {

    private final String name;
    private int position = 0;

    public Car(String name) {
        this.name = name;
    }

    public void Go() {
        this.position += 1;
    }

    public String CarName() {
        return this.name;
    }

    public int GetPosition() {

        return this.position;
    }

}
