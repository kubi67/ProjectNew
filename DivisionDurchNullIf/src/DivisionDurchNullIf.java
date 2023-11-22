/*
 * Einfaches Beispiel für die einseitig bedingte Anweisung
	Es soll die Division durch Null verhindert werden
 */

public class DivisionDurchNullIf {

	public static void main(String[] args) {
		int divident=12, divisor=0;

		if (divisor != 0)
			System.out.println
			("Ergebnis der Division: "+(divident/divisor));

	}
}
