
public class SchreibeSterne1Par {

	public static void main(String[] args) {
		schreibeSterne( 5);
		schreibeSterne(10);
		schreibeSterne(15);
		schreibeSterne(10);
		schreibeSterne( 5);
	}

	public static void schreibeSterne (int anzahl) {
		for (int i=1; i<=anzahl; i++)
			System.out.print  ("*");
		System.out.println();
	}
}
