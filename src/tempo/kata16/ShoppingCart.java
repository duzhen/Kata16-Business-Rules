package tempo.kata16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
	private static ShoppingCart instance;
	private List<IProduct> carts = new ArrayList<IProduct>();
	
	private ShoppingCart() {}
	
	public static ShoppingCart getInstance() {
		if(instance == null) {
			instance = new ShoppingCart();
		}
		
		return instance;
	}
	
	public void addProduct(IProduct product) {
		this.carts.add(product);
	}
	
	public void removeProduct(IProduct product) {
		this.carts.remove(product);
	}
	
	public Iterator<IProduct> iterator() {
		return this.carts.iterator();
	}
}
