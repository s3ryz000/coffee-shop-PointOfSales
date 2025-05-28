import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

	//CUSTOMER INPUT
		System.out.print("Enter customer name: ");
		String cusName = scanner.nextLine();

		System.out.print("Is Loyalty Member? (true/false): ");
		boolean choice = scanner.nextBoolean();
		scanner.nextLine();

		Customer customer = new Customer(cusName, choice);
		System.out.println("\nCustomer Profile: \n" + customer.toString());
		customer.checkLoyalStatus();

	//PRODUCT INPUT
		System.out.print("\nEnter product name: ");
		String productName = scanner.nextLine();

		System.out.print("Enter quantity bought: ");
		int unitsBought = scanner.nextInt();
		if (unitsBought < 0 ){
			System.out.println("Received negative number. Closing program...");
			System.exit(0);
		}
		scanner.nextLine();
		System.out.print("Enter unit price: ");
		double unitPrice = scanner.nextDouble();
		if (unitPrice < 0 ){
			System.out.println("Received negative number. Closing program...");
			System.exit(0);
		}
		scanner.nextLine();

		double unitTotal = unitsBought * unitPrice;

		Product product = new Product(productName, unitsBought, unitPrice, unitTotal);

	//DISPLAY PRODUCT DETAILS
		System.out.println("\nProduct Profile: \n" + product.toString());
		System.out.printf("Sub-Total: %.2f \n", product.getTotal());


	//DISCOUNT CALCULATION
		if(product.getTotal() >= 1500){
			System.out.println("\nYou are entitled to a 20% discount!");
			customer.setDiscount(0.2);
		} else if(product.getTotal() >= 800 && product.getTotal() <= 1499){
			System.out.println("\nYou are entitled to a 10% discount!");
			customer.setDiscount(0.1);
		} else {
			System.out.println("\n\n20% discount if total >= 1500\n" + 
						"10% discount if total is between 800 and 1499\n" + 
						"No discount if total < 800");
		}
		System.out.println("Applicable Discount Percentage: " + customer.getDiscount()*100 + "%");
		double discountSubtrahend = (product.getTotal() * customer.getDiscount());
		System.out.printf("Applicatble Discount Amount: %.2f", discountSubtrahend);


		product.setTotal(product.getTotal() - discountSubtrahend);

	// PRINT WITH VAT DETAILS
		product.printWithVAT();
		

		scanner.close();
	}

}









