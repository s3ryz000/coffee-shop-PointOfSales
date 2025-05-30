public class Weapon {
    protected String name;
    protected int weaponDmg;

    public Weapon(String name, int weaponDmg) {
        this.name = name;
        this.weaponDmg = weaponDmg;
        System.out.println("[LOG] Weapon constructor called for: " + name);
    }

    public String getName() {
        return name;
    }

    public int getWeaponDmg() {
        return weaponDmg;
    }

    @Override
    public String toString() {
        return "Weapon: " + name + " | Damage: " + weaponDmg;
    }
}
