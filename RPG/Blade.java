import java.util.Random;

public class Blade extends Weapon {

	public Blade() {
		// Basically [ Weapon(String name, int attackPts) ]
		super("Blade", 15); 
    	}

    	@Override
    	public String toString() {
        	return "Weapon: " + getName() +
               	" | AttackPts: " + getAttackPts();
    	}	

	
	public void bladeFury(){
		Random rand = new Random();
		int totalDamage = 0;

		System.out.println("Special Move: Blade Fury!");
		System.out.println("This move hits 5 times with random additional bonus damage ranging from 1 to 5");

		for(int i=0; i<5; i++){
			//nextInt(n) returns a random integer starting from 0 to n
			int bonus = rand.nextInt(5) + 1; //+1 cause it starts at 0
			int hitDamage = getAttackPts() + bonus;
			totalDamage += hitDamage;

       			System.out.println("Hit " + (i + 1) + ": " + hitDamage + " damage!");
		
		}
    		System.out.println("Total Blade Fury Damage: " + totalDamage);
	}
}
