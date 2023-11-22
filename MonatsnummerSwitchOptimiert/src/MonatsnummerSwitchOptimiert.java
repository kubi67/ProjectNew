/*
 * Weiter Optimierung: Anzahl Ausgabeanweisungen reduzieren:
 * Wir init. einen String mit den gemeinsamen Anfangsworten.
 * Danach hängen wir in jedem der Fälle den entsprechenden Namen an
 * u. geben den ganzen String einmalig nach der Struktur aus.
 */
public class MonatsnummerSwitchOptimiert {

	public static void main(String[] args) {
		int monatsnummer = 11;
		String s = "Der Monat mit der Nummer "+monatsnummer+": ";
		
		switch (monatsnummer) {
		case  1: s = s+"Januar";	break;	// Infix: s += "...";
		case  2: s = s+"Februar";	break;
		case  3: s = s+"Maerz";		break;
		case  4: s = s+"April";		break;
		case  5: s = s+"Mai";		break;
		case  6: s = s+"Juni";		break;
		case  7: s = s+"Juli";		break;
		case  8: s = s+"August";	break;
		case  9: s = s+"September";	break;
		case 10: s = s+"Oktober";	break;
		case 11: s = s+"November";	break;
		case 12: s = s+"Dezember";	break;
		default: s = s+"existiert nicht!";
		}
		
		System.out.println(s);
	}
}
