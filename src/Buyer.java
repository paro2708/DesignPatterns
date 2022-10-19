public class Buyer extends Person {
	private ProductMenu theProductMenu;
	public void showMenu() {
		System.out.println("Bridge pattern.\n" +
				"Created a Buyer");
		System.out.println("Showing the Produce Product Menu\n" +
				"1. Tomato\n" +
				"2. Onion\n");
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
