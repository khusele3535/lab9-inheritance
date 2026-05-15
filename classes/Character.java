package assignments.classes;

public class Character {
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int mp;
    protected int maxMp;

    public Character(String name) {
        this.name = name;
        this.hp = 100;
        this.maxHp = 100;
        this.mp = 50;
        this.maxMp = 50;
    }

    public String getName() {
        return this.name;
    }

    public int getHp() {
        return this.hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void takeDamage(int amount) {
        if (amount > 0) {
            this.hp = Math.max(0, this.hp - amount);
        }
    }

    @Override
    public String toString() {
        return "⚔️ [" + this.name + "] [HP: " + this.hp + "/" + this.maxHp + ", MP: " + this.mp + "/" + this.maxMp + "]";
    }
}
