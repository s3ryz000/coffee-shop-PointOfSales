import java.util.Random;

public class Sword extends Weapon {

    public Sword() {
        super("Basic Sword", 10);
        System.out.println("[LOG] Sword constructor called");
    }

    public int slashFury() {
        Random rand = new Random();
        int total = 0;
        System.out.println("[LOG] Slash Fury Activated!");
        for (int i = 1; i <= 5; i++) {
            int bonus = rand.nextInt(6); // 0 to 5
            System.out.println(" Slash " + i + ": +" + bonus + " bonus dmg");
            total += bonus;
        }
        int totalDmg = weaponDmg + total;
        System.out.println("Total Slash Fury Damage: " + totalDmg);
        return totalDmg;
    }
}
