package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class NotifyMemebershipChange extends BaseStrategy {

	public NotifyMemebershipChange(IStrategy strategy) {
		super(strategy);
	}

	@Override
	public String execute(String name) {
		System.out.println(strategy.execute(name) + " membership notification");
		return "nofify";
	}
}
