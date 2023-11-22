/*
 * Gewünschte Ausgabe:
 * 1 2 3 4 5 6 7 8 9 10
 * Beispiel für die lesende Verwendung 
 * der Zählvariablen i innerhalb der Schleife
 */

public class Hochzaehlen {

	public static void main(String[] args) {
		
		for (int i=1; i<=10; i = i+1) 	// i:1..10
			System.out.print  (i+" ");
		
		System.out.println();
	}
}
