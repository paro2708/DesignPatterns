import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ProduceProductMenu implements ProductMenu {
	ArrayList<String> produceItems = new ArrayList<>();
	public void showMenu() throws IOException {
		BufferedReader bufReader = new BufferedReader(new FileReader("ProductInfo.txt"));
		ArrayList<String> listOfLines = new ArrayList<>();
		String line = bufReader.readLine();
		while (line != null) {
			listOfLines.add(line);
			line = bufReader.readLine();
		}
		bufReader.close();

		for(String s : listOfLines) {
			if (s.startsWith("Produce")) {
				produceItems.add(s.substring("Produce:".length()));
			}
		}

		System.out.println("The items in the Produce menu are:");
		for(String s : produceItems) {
			System.out.println(s);
		}
    }

	public void showAddButton() {
		System.out.println("Adding buttons in Produce Product Menu");
	}

	public void showViewButton() {
		System.out.println("Showing the view button in Produce Product Menu");
	}

	public void showRadioButton() {
		System.out.println("Showing the radio button in Produce Product Menu");
	}

	public void showLabels() {
		System.out.println("Showing the labels in Produce Product Menu");
	}

	public void showComboxes() {
		System.out.println("Showing the combo boxes in Produce Product Menu");
	}
}
