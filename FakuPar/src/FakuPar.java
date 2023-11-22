
public class FakuPar {

	public static void main(String[] args) {
		faku(5);
		faku(3);
		faku(8);
	}

	public static void faku(int n) {
		int ergebnis = 1;

		for (int i=1; i<=n; i++)
			ergebnis *= i;
		
		System.out.println
		("Die Faku von "+n+" ist "+ergebnis);		
	}
}
