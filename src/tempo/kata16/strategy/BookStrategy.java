package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class BookStrategy extends BaseStrategy {

	public BookStrategy(IStrategy strategy) {
		super(strategy);
	}
	
	@Override
	public String execute(String name) {
		String duplicate =  "Duplicate " + super.execute(name);
		System.out.println(duplicate);
		return duplicate;
	}
}
