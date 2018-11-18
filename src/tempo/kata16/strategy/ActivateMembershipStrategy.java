package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class ActivateMembershipStrategy implements IStrategy {

	@Override
	public String execute(String name) {
		System.out.println("Activate " + name);
		return "activate";
	}

}
