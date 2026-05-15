package assignments.classes;

public class Warrior extends Character {
    protected boolean shielded;

    public Warrior(String name) {
        super(name);
        this.hp = 150;
        this.maxHp = 150;
        this.shielded = false;
    }

    public void shieldBash() {
        this.shielded = true;
    }

    @Override
    public void takeDamage(int amount) {
        if (this.shielded) {
            super.takeDamage(amount / 2);
            this.shielded = false;
        } else {
            super.takeDamage(amount);
        }
    }
}
