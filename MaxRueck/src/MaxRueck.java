/*
 * Beispiel für eine Methode mit Rückgabewert u. "single out",
 * d.h. nur eine return-Anweisung am Ende der Methode
 */

public class MaxRueck {

	public static void main(String[] args) {
		System.out.print ("Das Maximum von 3 u. 5 ist ");
		System.out.println(max(3,5));
	}

	public static int max(int a, int b) {
		int rueck;
		
		if (a>=b)
			rueck = a;
		else
			rueck = b;
		
		return rueck;
	}
}
