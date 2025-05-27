public class LoyaltyApp{
	
	public static void main(String[] args){

		//Customer(String name, int points)
		Customer customer = new Customer("Juno", 99);

		System.out.println(customer.toString());

		System.out.println("Welcome back to " 
						+ customer.getBrand() + 
						", " 
						+ customer.getName() +
						".");


		System.out.println("You have " + customer.getPoints() + " points.");
		customer.addPoints(1);
		customer.redeemFreeDrink(customer.getPoints()); 	
	}
}