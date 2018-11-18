package tempo.kata16.product;

import tempo.kata16.IProduct;
import tempo.kata16.IStrategy;

public abstract class Product implements IProduct {
	protected String name;
	protected IStrategy strategy;
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public void setStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public String payment() {
		return strategy.execute(name);
	}
}
