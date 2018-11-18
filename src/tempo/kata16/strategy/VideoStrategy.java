package tempo.kata16.strategy;

import tempo.kata16.IStrategy;

public class VideoStrategy implements IStrategy {

	@Override
	public String execute(String name) {
		System.out.println("Add a free \"First Aid\" to the packing slip");
		return "video";
	}

}
