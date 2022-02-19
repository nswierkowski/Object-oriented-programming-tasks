package KonwerterWalut;

import java.util.Scanner;

public class Konwerter {

	static double przelicznik = 4.29;
	
	public static double zloty(double zloty) {
		return (Math.round((zloty/przelicznik)*100))/100.00;
	}
	
	public static double euro(double euro) {
		return Math.round(euro*przelicznik*100)/100.00;
	}
}
