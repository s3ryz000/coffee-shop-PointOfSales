import java.util.Scanner;

public class ExInputItem{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter item name: ");
		String name = scanner.nextLine();

		System.out.print("Enter quantity: ");
		int qty = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Enter price per item: ");
		double price = scanner.nextDouble();
		scanner.nextLine();

		// Item(String name, int qty, double unitPrice)

		Item latte = new Item(name, qty, price);
		System.out.println("\n--- RECEIPT ---");
		System.out.println(latte.toString());
		System.out.println(latte.getName() + " * " + 
					   latte.getQty() + " = ₱" +
				   	   latte.getTotal());

	}
}
