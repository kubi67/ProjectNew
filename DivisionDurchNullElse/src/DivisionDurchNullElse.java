/*
 * Einfaches Beispiel für den Übergang von zwei einseitig bed. Anw.
	zu einer zweiseitigen
	Nutzen: Kürzer, schneller, übersichtlicher
 */

public class DivisionDurchNullElse {

	public static void main(String[] args) {
		int divident=12, divisor=4;

		if (divisor == 0)	// if 1
			System.out.println("Fehler! Division durch Null!");
		
		else //if (divisor != 0)	// if 2
			System.out.println
			("Ergebnis der Division: "+(divident/divisor));
	}
}
