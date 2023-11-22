/*
 * Programm berechnet der Fakultät einer Zahl n
 * in Anlehnung an die Berechnung der Zweierpotenz von n
 * als Übung zur Infixnotation
 * Die Zählvariable "i" hat eine Doppelrolle:
 * 1. um die Schleifendurchläufe u. damit Multiplipationen zu zählen 
 * 2. um die Zahlen zu generieren, die aufmulitpliziert werden
 */

public class Fakultaet {

	public static void main(String[] args) {
		int n = 5;
		// *******
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++) {	// i:1..n
			ergebnis *= i;			// Infixnotation
			System.out.println("Die Faku von "+i+" ist "+ergebnis);
		}
	}

}
