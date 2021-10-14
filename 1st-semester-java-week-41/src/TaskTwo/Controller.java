package TaskTwo;

public class Controller {
	private Dialog UI;
	private View output;
	private CalculateVat vat;
	private final String MSG;

	public Controller() {
		this.UI = new Dialog();
		this.output = new View("Kr");
		this.vat = new CalculateVat(25);
		MSG = "MOMS";
	}

	public void run() {
		double userIn = UI.getUserInput();
		double moms = vat.calc(userIn);
		output.print(moms, MSG);
	}
}
