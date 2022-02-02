package OOP.HeroesAndEnemiesGame;

public class Wizard extends Hero {

    public Wizard(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": Абракадабра и " + enemy.getName() + " превратился в муравьеда");
        enemy.takeDamage(this, getDamage());
    }
}
