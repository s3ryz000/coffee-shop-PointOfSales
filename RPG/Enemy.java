public class Enemy extends Character {

    public Enemy(String name, int baseHealth, int baseAtk, int baseDef, int level) {
        super(name, baseHealth + (level * 8), baseAtk + (level * 2), baseDef + (level * 1), level);
        System.out.println("[LOG] Enemy constructor called");
    }
}
