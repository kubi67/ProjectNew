
public class ZerfallWhile {

	public static void main(String[] args) {
		double startWert = 1.0, grenzWert = 0.1;
		// **************************************
		double aktuWert = startWert;
		int hwz = 0;
		
		System.out.println("Wie viele Halbwertszeiten muessen vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+"?\n");
		
		while (aktuWert >= grenzWert) {
			System.out.println("Nach "+hwz+" HWZs: "+aktuWert);
			aktuWert = aktuWert / 2;	// akutWert /= 2;
			++hwz;
		}
		
		System.out.println("\nEs muessen "+hwz+" Halbwertszeiten vergehen,");
		System.out.println("bis von einer Substanz der Menge "+startWert);
		System.out.println
		("nur noch weniger uebrig ist als der Grenzwert "+grenzWert+",");
		System.out.println("naemlich "+aktuWert+".");
	}

}
