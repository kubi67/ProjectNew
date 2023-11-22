/*
 * Umgestaltung der while- in eine do-while-Schleife,
 * um beim ersten Schleifendurchlauf das unnötige Prüfen
 * der Bedingung zu vermeiden
 */
public class ZerfallDo {

	public static void main(String[] args) {
		double startWert = 1.0, grenzWert = 0.1;
		// **************************************
		double aktuWert = startWert;
		int hwz = 0;
		
		System.out.println("Wie viele Halbwertszeiten muessen vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+"?\n");
		
		if (startWert < grenzWert) {	// wenn nichts zu tun ist,...
			System.out.println			// dann entsprechende Meldung,
			("Schon von vorne herein ist der Startwert kleiner als der Grenzwert!");
										// nur wenn etwas zu tun ist:
		} else {	// startWert = aktuWert >= grenzWert

// 			ursprüngliche while-Schleife:
//			while (aktuWert >= grenzWert) {
//				System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
//				aktuWert = aktuWert / 2;	// akutWert /= 2;
//				++hwz;
//			}
			
// 			umgestaltete do-while-Schleife:
			do {
				System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
				aktuWert = aktuWert / 2;	// akutWert /= 2;
				++hwz;
			} while (aktuWert >= grenzWert);
			
			System.out.println("\nEs muessen "+hwz+" Halbwertszeiten vergehen,");
			System.out.println("bis von einer Substanz der Menge "+startWert);
			System.out.println
			("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+",");
			System.out.println("naemlich "+aktuWert+".");
		}
	}

}
