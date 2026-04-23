package week9;

public class Car extends Vehicle {
    public Car(int speed) {
        super(speed);
    }

    public void drive() {
        System.out.println("Car is driving.");
    }

    @Override
    public void showSpeed() {
        System.out.println("Car speed is: " + speed + " km/h");
    }
}
