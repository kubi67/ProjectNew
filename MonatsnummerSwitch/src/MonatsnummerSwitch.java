/*
 * Umgestaltung des Beispiels auf Basis einer Kaskade
 * zu einem Switch:
 * Variable "monatsnummer" muss nur einmal erwähnt werden
 * Benefit: kürzer u. übersichtlicher
 */
public class MonatsnummerSwitch {

	public static void main(String[] args) {
		int monatsnummer = 11;

		System.out.print  
		("Der Monat mit der Nummer "+monatsnummer+": ");
		
		switch (monatsnummer) {
		case  1: System.out.println("Januar");		break;
		case  2: System.out.println("Februar");		break;
		case  3: System.out.println("Maerz");		break;
		case  4: System.out.println("April");		break;
		case  5: System.out.println("Mai");			break;
		case  6: System.out.println("Juni");		break;
		case  7: System.out.println("Juli");		break;
		case  8: System.out.println("August");		break;
		case  9: System.out.println("September");	break;
		case 10: System.out.println("Oktober");		break;
		case 11: System.out.println("November");	break;
		case 12: System.out.println("Dezember");	break;
		default: System.out.println("existiert nicht!");
		}
		
/*		if (monatsnummer == 1)
			System.out.println("Januar");
		else if (monatsnummer == 2)
			System.out.println("Februar");
		else if (monatsnummer == 3)
			System.out.println("Maerz");
		else if (monatsnummer == 4)
			System.out.println("April");
		else if (monatsnummer == 5)
			System.out.println("Mai");
		else if (monatsnummer == 6)
			System.out.println("Juni");
		else if (monatsnummer == 7)
			System.out.println("Juli");
		else if (monatsnummer == 8)
			System.out.println("August");
		else if (monatsnummer == 9)
			System.out.println("September");
		else if (monatsnummer == 10)
			System.out.println("Oktober");
		else if (monatsnummer == 11)
			System.out.println("November");
		else if (monatsnummer == 12)
			System.out.println("Dezember");
		else 
			System.out.println("existiert nicht!");
*/
	}
}
