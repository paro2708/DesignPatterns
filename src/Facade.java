import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Facade {
	private int UserType;
	private int theSelectedProduct;
	private int nProductCategory;
	private ArrayList<String> theProductList;
	private Person thePerson;
	private ProductMenu theProductMenu;

	public void initiateFacade() throws IOException {
		System.out.println(">>>>>>>>>>Facade pattern<<<<<<<<<<");
		Login l = new Login();
		UserType = l.login();

		System.out.println(">>>>>>>>>>Iterator pattern<<<<<<<<<<");
		ClassProductList productList = new ClassProductList();
		createProductList(productList);

		System.out.println("Displaying the product list:");

		ProductIterator iterator = new ProductIterator(theProductList);
		iterator.createIterator();
		while(iterator.HasNext()) {
			System.out.println(iterator.Next());
		}
		System.out.println();

		System.out.println("Select product category\n" +
				"0 for Meat Product Menu\n" +
				"1 for Produce Product Menu\n");

		Scanner sc = new Scanner(System.in);
		nProductCategory = sc.nextInt();

		createUser(l.userType, nProductCategory);

		System.out.println(">>>>>>>>>>Visitor pattern<<<<<<<<<<");
		remind();
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
		NodeVisitor reminder = new ReminderVisitor();
		ClassProductList cpl = new ClassProductList();
		cpl.accept(reminder);
	}

	public void createUser(int userType, int nProductCategory) throws IOException {
		System.out.println(">>>>>>>>>>Factory pattern<<<<<<<<<<");
		if(userType == 0) {
			Person p = new Seller(nProductCategory);
			p.showMenu();
		} else if(userType == 1) {
			Person p = new Buyer(nProductCategory);
			p.showMenu();
		}
	}

	public void createProductList(ClassProductList productList) throws IOException {
		BufferedReader bufReader = new BufferedReader(new FileReader("ProductInfo.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		for(String s : listOfLines) {
			theProductList = productList.addProduct(s);
		}
	}

	public void AttachProductToUser() {

	}

	public void productOperation() {

	}

}
