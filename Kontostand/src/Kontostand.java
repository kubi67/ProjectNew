/*
 * Ausgabe soll sein:
 * 1. Das Konto ist im Haben
 * 2. Das Konto ist ausgeglichen
 * 3. Das Konto ist im Soll
 */
public class Kontostand {

	public static void main(String[] args) {
		double kontostand = -100.0;

		System.out.print  ("Das Konto ist mit "+kontostand+"€ ");
		
		if (kontostand > 0.0)				// Fall 1
			System.out.println("im Haben");
		else if (kontostand == 0.0)			// Fall 2
			System.out.println("ausgeglichen");
		else 	// if (kontostand < 0.0)	// Fall 3
			System.out.println("im Soll");
	}

}
