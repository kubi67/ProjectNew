
public class AllgemeinePotenzParameter {

	public static void main(String[] args) {
		hoch(3,5);
		hoch(2,8);
		hoch(3,2);
	}

	public static void hoch(int basis, int expo) {
		int ergebnis = 1;

		for (int i=1; i <= expo; i++)
			ergebnis *= basis;
		
		System.out.println
		(basis+" hoch "+expo+" = "+ergebnis);		
	}
}
