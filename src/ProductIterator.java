import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;

public class ProductIterator {

	ArrayList<String> productList = new ArrayList<>();
	int idx = 0;
	ProductIterator(ArrayList<String> theProductList) {
		productList = new ArrayList<>();
		for(int i=0; i<theProductList.size(); i++) {
			productList.add(theProductList.get(i));
		}
	}

	public ProductIterator createIterator() {
		return new ProductIterator(productList);
	}
	public String Next() {
		String productName = productList.get(idx);
		idx++;
		return productName;
	}

	public boolean HasNext() {
		if(idx < productList.size()) {
			return true;
		} else {
			return false;
		}
	}

	public void MoveToHead() {
		idx = 0;
	}

	public void Remove() {

	}

}
