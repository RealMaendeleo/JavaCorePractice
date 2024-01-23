package OOP.HeroesAndEnemiesGame;

public class BattleGround {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Князь Владимир", 80);
        Wizard wizard = new Wizard("Гэндальф", 25);
        Archer archer = new Archer("Соколиный глаз", 98);

        Enemy voldemort = new Enemy("Волан-де-Морт", 70);
        attackEnemies(voldemort, warrior, wizard, archer);

        Zombie zombie = new Zombie("Чак", 20);
        attackEnemies(zombie, warrior);

        System.out.println("Все враги повержены!");
    }

    public static void attackEnemies(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if (enemy.isAlive() && hero.isAlive()) {
                    hero.attackEnemy(enemy);
                    System.out.println();
                } else if (!enemy.isAlive()) {
                    break;
                }
            }
        }
    }
}
