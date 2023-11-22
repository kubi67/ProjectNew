/*
 * Beispiel für eine Methode mit einem Parameter
 * In einem Programm können mehrfach
 * Berechnungen für unterschiedliche Werte erfolgen,
 * hier die Zweierpotenzen von mehreren Zahlen
 */

public class ZweierpotenzParameter {

	public static void main(String[] args) {
		zweihoch(8);
		zweihoch(4);
		zweihoch(16);
	}

	public static void zweihoch (int n) {
		int ergebnis = 1;
		
		for (int i=1; i<=n; i++)		// i:1..n
			ergebnis *= 2;
		
		System.out.println("2 hoch "+n+" ist "+ergebnis);		
	}
}
