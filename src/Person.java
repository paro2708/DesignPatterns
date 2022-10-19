import java.io.IOException;

public abstract class Person {
	private ProductMenu theProductMenu;

	private ProductMenu productMenu;

	public abstract void showMenu() throws IOException;

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract ProductMenu CreateProductMenu();

}
