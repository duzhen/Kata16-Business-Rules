package tempo.kata16;

import tempo.kata16.product.PhysicalProduct;
import tempo.kata16.product.VirtualProduct;
import tempo.kata16.strategy.ActivateMembershipStrategy;
import tempo.kata16.strategy.BookStrategy;
import tempo.kata16.strategy.NotifyMemebershipChange;
import tempo.kata16.strategy.PhysicalStrategy;
import tempo.kata16.strategy.UpgradeMembershipStrategy;
import tempo.kata16.strategy.VideoStrategy;

public class ChooseProduct {

	private ChooseProduct() {}
	
	static public IProduct getProduct(String type) {
		IProduct product = null;
		if("physical".equals(type)) {
			product = new PhysicalProduct("Pyhsical");
			product.setStrategy(new PhysicalStrategy());
		} else if("book".equals(type)) {
			product = new PhysicalProduct("Book");
			product.setStrategy(new BookStrategy(new PhysicalStrategy()));
		} else if("activate_membership".equals(type)) {
			product = new VirtualProduct("membership");
			product.setStrategy(new NotifyMemebershipChange(new ActivateMembershipStrategy()));
		} else if("upgrade_membership".equals(type)) {
			product = new VirtualProduct("membership");
			product.setStrategy(new NotifyMemebershipChange(new UpgradeMembershipStrategy()));
		} else if("video".equals(type)) {
			product = new VirtualProduct("video");
			product.setStrategy(new VideoStrategy());
		}
		
		return product;
	}
}
