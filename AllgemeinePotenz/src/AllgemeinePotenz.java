/*
 * Übung zur Infix-Notation
 */

public class AllgemeinePotenz {

	public static void main(String[] args) {
		int basis = 3, expo = 5;
		// ***********************
		int ergebnis = 1;

		for (int i=1; i<=expo; i++) {	// i:1..expo
			ergebnis *= basis;	// Infix-Notation 
			System.out.println
			(basis+" hoch "+i+" ist "+ergebnis);
		}
	}
}
