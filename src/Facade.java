import java.io.IOException;
import java.util.Scanner;

public class Facade {
	private int UserType;
	private int theSelectedProduct;
	private int nProductCategory;
	private ClassProductList theProductList;
	private Person thePerson;
	private ProductMenu theProductMenu;

	public void initiateFacade() throws IOException {
		System.out.println("Facade pattern");

		Login l = new Login();
		UserType = l.login();

		System.out.println("Select product category\n" +
				"0 for Meat Product Menu\n" +
				"1 for Produce Product Menu");

		Scanner sc = new Scanner(System.in);
		nProductCategory = sc.nextInt();

		createUser(l.userType, nProductCategory);

	}
	public Product selectProduct() {
		return null;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(int userType, int nProductCategory) throws IOException {
		if(userType == 0) {
			Person p = new Seller(nProductCategory);
			p.showMenu();
		} else if(userType == 1) {
			Person p = new Buyer(nProductCategory);
			p.showMenu();
		}
	}

	public void createProductList() {

	}

	public void AttachProductToUser() {

	}

	public void productOperation() {

	}

}
