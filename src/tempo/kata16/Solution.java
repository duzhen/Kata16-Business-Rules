package tempo.kata16;

public class Solution {

	private static String[] orders = {"physical", "book", "activate_membership", "upgrade_membership", "video"};
	public static void main(String[] args) {
		for(String s: orders) {
			ShoppingCart.getInstance().addProduct(ChooseProduct.getProduct(s));
		}
		
		ShoppingCart.getInstance().iterator().forEachRemaining((product)-> {
			System.out.println("\nProcessing " + product.getName());
			product.payment();
		});
	}

}
