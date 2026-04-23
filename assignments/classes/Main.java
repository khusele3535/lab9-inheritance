package week9;

class Main {
    static void main() {

        // 1. Animal Test
        Dog myDog = new Dog("Buddy");
        myDog.eat();
        myDog.bark();

        Cat myCat = new Cat("Kitty");
        myCat.meow();

        // 2. Vehicle Test
        Car myCar = new Car(100);
        myCar.showSpeed();
        myCar.drive();

        // 3. Employee Test
        Manager mgr = new Manager("Bat");
        Developer dev = new Developer("Bold");
        mgr.manage();
        dev.code();

        System.out.println("\n--- Program finished successfully! ---");
    }
}
