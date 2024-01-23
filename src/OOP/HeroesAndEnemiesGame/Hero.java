package OOP.HeroesAndEnemiesGame;

public abstract class Hero implements Mortal {

    private String name;
    private int health = 100;
    private int damage;

    public Hero(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
