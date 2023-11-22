/*
 *Beispiel für zwei unabhängige einseitig bed. Anw.,
 *die in eine zweiseitige bed. Anw. zusammengefasst wurden.
 */

public class BetragElse {

	public static void main(String[] args) {
		int a=-5, betrag=0;
		
		if (a >= 0)
			betrag = a;
		else 				//if (a < 0)
			betrag = -a;

		System.out.println
		("Der Betrag von "+a+" ist "+betrag);
	}

}
