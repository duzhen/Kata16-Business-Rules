package tempo.kata16;

public interface IProduct {
	String getName();
	void setStrategy(IStrategy strategy);
	String payment();
}
