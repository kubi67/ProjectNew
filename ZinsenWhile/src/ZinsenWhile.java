
public class ZinsenWhile {

	public static void main(String[] args) {
		double startKapital = 100.0, zinssatz = 3.0;
		// ******************************************
		double aktuKapital = startKapital, 
		       q = 1.0 + (zinssatz/100.0);
		int jahre = 0;
		
		System.out.println
		("Wie viele Jahre dauert es,");
		System.out.println
		("bis sich ein Kapital von "+startKapital+" Euro");
		System.out.println
		("bei einem Zinssatz von "+zinssatz+"% verdoppelt hat?\n");
		
		while (aktuKapital < 2.0*startKapital) {
			System.out.println("Nach "+jahre+" Jahren: "+aktuKapital);
			aktuKapital = aktuKapital * q;
			++jahre;
		}
		
		System.out.println
		("\nEs dauert "+jahre+" Jahre,");
		System.out.println
		("bis sich ein Kapital von "+startKapital+" Euro");
		System.out.println
		("bei einem Zinssatz von "+zinssatz+"% verdoppelt hat,");
		System.out.println("naemlich auf "+aktuKapital+" Euro.");	
	}

}
