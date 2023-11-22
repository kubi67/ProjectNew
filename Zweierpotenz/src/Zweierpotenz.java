/*
 * Programm berechnet die Zweipotenz von n: 2 hoch n
 * als Übung zur Infixnotation
 */

public class Zweierpotenz {

	public static void main(String[] args) {
		int n = 8;
		// *******
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)	// i:1..n
			// ergebnis = ergebnis * 2;  alte, ausführliche Schreibw.
			ergebnis *= 2;	// Infixnotation, neue, kürzere Schreibw.
		
		System.out.println("2 hoch "+n+" ist "+ergebnis);
	}

}
