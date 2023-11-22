/*
 * Programm soll die Mehrfachausgabe demonstrieren:
 * Mehrere Argumente in einer Ausgabeanweisung,
 * verknüpft mit dem Pluszeichen zur "Konkatenation"
 */

public class TextUndZahlen {

	public static void main(String[] args) {
		int a=3, b=2;	//Die Variablen a u. b werden deklariert u. initialisiert

		System.out.println("Gegeben sind zwei Zahlen: "+a+" und "+b);
		System.out.println("Die Summe der Zahlen "+a+" und "+b+" ist "+(a+b));
		System.out.println("Das Produkt der Zahlen "+a+" und "+b+" ist "+(a*b));
		System.out.println("Die Differenz der Zahlen "+a+" und "+b+" ist "+(a-b));
	}
}
