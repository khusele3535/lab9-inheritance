package week9;

public class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    public void code() {
        System.out.println(name + " is writing code.");
    }
}
