package TaskTwo;

public class View {
	private final String CURRENCY;

	public View(String CURRENCY) {
		this.CURRENCY = CURRENCY;
	}

	public void print(double result, String typeOfResult) {
		System.out.printf("Du betaler %.2f%3s i %s%n", result, CURRENCY, typeOfResult);
	}
}
