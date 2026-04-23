package week9;

public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    public void manage() {
        System.out.println(name + " is managing the team.");
    }
}
