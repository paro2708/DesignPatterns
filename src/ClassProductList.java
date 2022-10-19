public class ClassProductList {

	private Product product;

	private ReminderVisitor reminderVisitor;

	public Reminder accept(NodeVisitor visitor) {
		System.out.println("Class product list reminder");
		return visitor.visitProduct(product);
	}

}
