public class Character {
    private String name;
    private int baseHealth;
    private int baseAtk;
    private int baseDef;
    private int level;

    public Character(String name, int baseHealth, int baseAtk, int baseDef, int level) {
        this.name = name;
        this.baseHealth = baseHealth;
        this.baseAtk = baseAtk;
        this.baseDef = baseDef;
        this.level = level;
        System.out.println("[LOG] Character constructor called for: " + name);
    }

    public String getName() {
        return name;
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    public int getBaseAtk() {
        return baseAtk;
    }

    public int getBaseDef() {
        return baseDef;
    }

    public int getLevel() {
        return level;
    }

    public void takeDamage(int damage) {
        baseHealth -= damage;
        if (baseHealth < 0) baseHealth = 0;
    }

    public boolean isAlive() {
        return baseHealth > 0;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nHealth: " + baseHealth +
                "\nAttack: " + baseAtk +
                "\nDefense: " + baseDef +
                "\nLevel: " + level;
    }
}
