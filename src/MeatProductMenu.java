import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MeatProductMenu implements ProductMenu {

	ArrayList<String> produceItems = new ArrayList<>();
	public void showMenu() throws IOException {
		BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\Paromita Roy\\Documents\\Fall22\\SER515\\Assignments\\DP\\DP\\src\\ProductInfo.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		for(String s : listOfLines) {
			if (s.startsWith("Meat")) {
				produceItems.add(s.substring("Meat:".length()));
			}
		}

		System.out.println("The items in the Meat menu are:");
		for(String s : produceItems) {
			System.out.println(s);
		}
	}
	public void showAddButton() {
		System.out.println("Adding buttons in Meat Product Menu");
	}

	public void showViewButton() {
		System.out.println("Showing the view button in Meat Product Menu");
	}

	public void showRadioButton() {
		System.out.println("Showing the radio button in Meat Product Menu");
	}

	public void showLabels() {
		System.out.println("Showing the labels in Meat Product Menu");
	}

	public void showComboxes() {
		System.out.println("Showing the combo boxes in Meat Product Menu");
	}
}
