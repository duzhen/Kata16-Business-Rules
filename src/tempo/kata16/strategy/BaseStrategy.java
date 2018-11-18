package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public abstract class BaseStrategy implements IStrategy {
	protected IStrategy strategy;
	
	public BaseStrategy(IStrategy strategy) {
		this.strategy = strategy;
	}

	@Override
	public String execute(String name) {
		return strategy.execute(name);
	}
}
