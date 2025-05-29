public class Weapon{
	private String name;
	private int attackPts;

	Weapon(String name, int attackPts){
		this.name = name;
		this.attackPts = attackPts;
	}

	public String getName(){
		return name;
	}
	public int getAttackPts(){
		return attackPts;
	}

	@Override
	public String toString(){
		return "Weapon: " + name +
				" | AttackPts: " + attackPts;
	}
}