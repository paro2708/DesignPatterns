import java.io.IOException;

public class Buyer extends Person {
	private ProductMenu theProductMenu;
	int category;

	Buyer(int productCategory) throws IOException {
		category = productCategory;
	}
	public void showMenu() throws IOException {
		if(category == 0) {
			MeatProductMenu menu = new MeatProductMenu();
			menu.showMenu();
		} else if (category == 1) {
			ProduceProductMenu menu = new ProduceProductMenu();
			menu.showMenu();
		}
	}

	public ProductMenu CreateProductMenu() {
		return null;
	}

}
