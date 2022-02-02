package OOP.HeroesAndEnemiesGame;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": Достаю меч и разрезаю напополам " + enemy.getName() + "'а");
        enemy.takeDamage(this, getDamage());
    }
}
