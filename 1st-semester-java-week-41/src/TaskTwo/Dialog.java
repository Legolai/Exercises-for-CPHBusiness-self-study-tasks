package TaskTwo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dialog {

	public double getUserInput() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Indtast varens pris: ");
		double number;
		try {
			number = myScan.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Husk! Tager kun komma notation ved decimaltal.");
			number = getUserInput();
		}
		myScan.close();
		return number;
	}

}
