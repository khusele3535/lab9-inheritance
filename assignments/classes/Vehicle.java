package week9;

public class Vehicle {
    int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void showSpeed() {
        System.out.println("Vehicle speed: " + speed + " km/h");
    }
}
