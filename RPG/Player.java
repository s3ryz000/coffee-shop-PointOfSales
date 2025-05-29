public class Player{
	private String name;
	private int healthPts;
	private int attackPts;
	private Weapon equippedWeapon;

	Player(String name, int healthPts, int attackPts){
		this.name = name;
		this.healthPts = healthPts;
		this.attackPts = attackPts;
	}

	public String getName(){
		return name;
	}
	public int getHealthPts(){
		return healthPts;
	}
	public int getAttackPts(){
		return attackPts;
	}

	public String attack(){
		attackPts += equippedWeapon.getAttackPts();
		return "Rome attacks with " + attackPts + " damage!";
	}

	public String setEquip(Weapon weapon){
		this.equippedWeapon = weapon;
		return "You have equipped [" + weapon.getName() + "]\n" + weapon.toString();
	}

	@Override
	public String toString(){
		return "Player Name: " + name +
				" | HealthPts: " + healthPts +
				" | AttackPts: " + attackPts;
	}
	
}
