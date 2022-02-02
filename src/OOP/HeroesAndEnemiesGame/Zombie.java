package OOP.HeroesAndEnemiesGame;

public class Zombie extends Enemy {
    private int rebornAmount;

    public Zombie(String name, int reverseDamage) {
        super(name, reverseDamage);
    }

    public void reborn() {
        if (getHealth() == 0 && rebornAmount == 1) {
            setHealth(15);
        }
    }
}
