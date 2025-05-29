public class Main{
	public static void main(String[] args){

		Player rome = new Player("Rome", 100, 10);
		System.out.println(rome.toString());


		Blade blade1 = new Blade();
		System.out.println(rome.setEquip(blade1));
		System.out.println(rome.attack() + "\n\n");
		blade1.bladeFury();
		
	}
}