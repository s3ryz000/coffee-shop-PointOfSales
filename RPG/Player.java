public class Player extends Character {
    private Weapon weapon;

    public Player(String name, int baseHealth, int baseAtk, int baseDef, int level, Weapon weapon) {
        super(name, baseHealth + (level * 10), baseAtk + (level * 2), baseDef + (level * 2), level);
        this.weapon = weapon;
        System.out.println("[LOG] Player constructor called");
    }

    public int totalAttack() {
        return getBaseAtk() + weapon.getWeaponDmg();
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
