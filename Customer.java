public class Customer{

	private String name;
	private int points;
	private static final String BRAND = "Bean Bros";

	Customer(String name, int points){
		this.name = name;
		this.points = points;
	}
	public String getName(){
		return name;
	}

	public int getPoints(){
		return points;
	}

	public String getBrand(){
		return BRAND;
	}	

	public int redeemFreeDrink(int points){
		if (points >= 100){
			System.out.println("You get a free drink!");
			points -= 100;
			System.out.println("Remaining points: " + points);
			return points;
		} else {
			System.out.println("Not enough points");
			return points;
		}
	}

	public int addPoints(int plusPoints){
		points += plusPoints;
		System.out.println("You have successfully added " + plusPoints + " point/s.");
		return points;
	}
	@Override 
	public String toString(){
		return BRAND + " Customer: " + name + "| Points: " + points;
	}

}







