
public class SchreibeSterne3Par {

	public static void main(String[] args) {
		schreibeSterne( 5,'a',false);
		schreibeSterne( 5,'b',false);
		schreibeSterne( 5,'c',true);
		schreibeSterne(15,'d',true);
		schreibeSterne( 5,'e',false);
		schreibeSterne( 5,'f',false);
		schreibeSterne( 5,'g',true);
	}

	public static void schreibeSterne
		(int anzahl, char zeichen, boolean nl) {
		for (int i=1; i<=anzahl; i++)
			System.out.print(zeichen);
		if (nl)
			System.out.println();
	}
}
