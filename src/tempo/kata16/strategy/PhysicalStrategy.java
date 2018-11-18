package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class PhysicalStrategy implements IStrategy {

	@Override
	public String execute(String name) {
		System.out.println("Generate a commission payment to the agent");
		String slip =  "Generate a packing slip for " + name;
		System.out.println(slip);
		return slip;
	}

}
