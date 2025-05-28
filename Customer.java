public class Customer{
	private String name;
	private boolean isLoyalMember;
	private double discount;

	Customer(String name, boolean isLoyalMember){
		this.name = name;
		this.isLoyalMember = isLoyalMember;
	}

	public String getName(){
		return name;
	}

	public boolean getMembership(){
		return isLoyalMember;
	}

	public void setDiscount(double value) {
   	 	this.discount += value;
	}

	public double getDiscount(){
		return discount;
	}

	public void checkLoyalStatus() {
    		if (isLoyalMember) {
			this.setDiscount(0.05);
        		System.out.println("Welcome Loyal Member " + name + ". Here is your 5% discount.");

    		} else {
        		System.out.println("For a lifetime 5% discount, sign up to be a Loyal Member today!");
    		}
	}


	
	@Override
	public String toString(){
		return "Name: " + name + 
			 " | Loyalty Member: " + isLoyalMember;
	}
}