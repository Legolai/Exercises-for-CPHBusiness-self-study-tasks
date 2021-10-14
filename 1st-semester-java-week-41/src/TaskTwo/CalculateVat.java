package TaskTwo;

public class CalculateVat {
	final int PRCVAT;

	public CalculateVat(int PRCVAT) {
		this.PRCVAT = PRCVAT;
	}

	public double calc(double number) {
		double VAT = number / 100 * PRCVAT;
		return VAT;
	}

}
