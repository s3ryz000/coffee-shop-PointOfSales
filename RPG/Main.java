public class Main {
    public static void main(String[] args) {
        // Setup
        Sword playerSword = new Sword();
        Player hero = new Player("Player", 100, 15, 10, 3, playerSword);
        Enemy goblin = new Enemy("Goblin", 80, 10, 8, 2);

        System.out.println("\n=== PLAYER STATUS ===");
        System.out.println(hero);
        System.out.println(hero.getWeapon());

        System.out.println("\n=== ENEMY STATUS ===");
        System.out.println(goblin);

        System.out.println("\n--- ENCOUNTER BEGINS ---\n");

        // Battle Loop
        int turn = 1;
        while (hero.isAlive() && goblin.isAlive()) {
            System.out.println(">> Turn " + turn);

            int heroAttack = hero.getBaseAtk() + playerSword.slashFury();
            int damageToEnemy = Math.max(0, heroAttack - goblin.getBaseDef());
            goblin.takeDamage(damageToEnemy);
            System.out.println(hero.getName() + " attacks for " + damageToEnemy + " damage!");

            if (!goblin.isAlive()) break;

            int enemyAttack = goblin.getBaseAtk();
            int damageToPlayer = Math.max(0, enemyAttack - hero.getBaseDef());
            hero.takeDamage(damageToPlayer);
            System.out.println(goblin.getName() + " attacks for " + damageToPlayer + " damage!");

            System.out.println("--> " + hero.getName() + " HP: " + hero.getBaseHealth());
            System.out.println("--> " + goblin.getName() + " HP: " + goblin.getBaseHealth());
            System.out.println();

            turn++;
        }

        // Result
        System.out.println("--- FIGHT ENDS ---");
        if (hero.isAlive()) {
            System.out.println(hero.getName() + " is victorious!");
        } else {
            System.out.println(goblin.getName() + " wins the battle!");
        }
    }
}
