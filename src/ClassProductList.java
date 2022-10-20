import java.util.ArrayList;

public class ClassProductList {

	private ArrayList<String> product = new ArrayList<>();

	private ReminderVisitor reminderVisitor;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Class product list reminder");
		return null;
	}

	public ArrayList<String> addProduct(String s) {
		if(s.startsWith("Meat")) {
			product.add(s.substring("Meat:".length()));
		} else if(s.startsWith("Produce")) {
			product.add(s.substring("Produce:".length()));
		}
		return product;
	}

//	public String getProduct(int idx) {
//		return product.get(idx);
//	}
}
