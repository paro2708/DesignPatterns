public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;

	private ClassProductList classProductList;

	public Reminder visitProduct(Product product) {
		System.out.println("Visiting product.");
        return null;
    }

	public void visitTrading(Trading trading) {
		System.out.println("Visiting trading.");
	}

	public void visitFacade(Facade facade) {
		System.out.println("Visiting facade");
	}

}
