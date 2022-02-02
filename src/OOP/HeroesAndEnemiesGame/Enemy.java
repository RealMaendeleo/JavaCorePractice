package OOP.HeroesAndEnemiesGame;

public class Enemy implements Mortal {
    private String name;
    private int health = 100;
    private int reverseDamage;

    public Enemy(String name, int reverseDamage) {
        this.name = name;
        this.reverseDamage = reverseDamage;
    }

    public void reverseAttack(Hero hero) {
        int newHealth = hero.getHealth() - reverseDamage;

        if (newHealth > 0) {
            hero.setHealth(newHealth);
            System.out.println("Ответка! " + hero.getName() + " здоровье: " + hero.getHealth());
        } else {
            System.out.println(hero.getName() + " погиб в бою.");
        }
    }

    public void takeDamage(Hero hero, int damage) {
        if (isAlive() && health <= damage) {
            health = 0;
            System.out.println(getName() + " погиб в бою.");
        } else {
            health -= Math.min(health, damage);
            System.out.println("Больно ударил. Осталось " + health + "xp");
            reverseAttack(hero);
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}