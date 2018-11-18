package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class UpgradeMembershipStrategy implements IStrategy {

	@Override
	public String execute(String name) {
		System.out.println("Upgrade " + name);
		return "upgrade";
	}

}
