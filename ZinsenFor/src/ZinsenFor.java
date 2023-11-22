
public class ZinsenFor {

	public static void main(String[] args) {
		double startKapital = 100.0, zinssatz  =3.0;
		int jahre = 10;
		// ******************************************
		double aktuKapital = startKapital,
			   q = 1.0 + (zinssatz/100.0);	// Zinsfuss
		
		System.out.println
		("Auf welchen Betrag waechst ein Startkapital von "
		+startKapital+" Euro");
		System.out.println("nach "+jahre+" Jahren an?\n");
		
		for (int i=1; i<=jahre; i++) {	// i:1..jahre
			aktuKapital = aktuKapital * q;	// Verzinsung
			System.out.println
			("Nach "+i+" Jahren: "+aktuKapital);
		}
		
		System.out.println
		("\nEin Kapital von "+startKapital+" Euro");
		System.out.println("waechst nach "+jahre+" Jahren");
		System.out.println("auf "+aktuKapital+" Euro an.");
	}

}
