package OOP.HeroesAndEnemiesGame;

public class Archer extends Hero {

    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + ": Меткий выстрел прямо между глаз " + enemy.getName() + "'а");
        enemy.takeDamage(this, getDamage());
    }
}
