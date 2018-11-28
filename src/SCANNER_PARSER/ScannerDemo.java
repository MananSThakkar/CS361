package SCANNER_PARSER;


/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "TEST.jay";
	private static int counter = 1;																						

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			System.out.print("Token " + counter + " : ");
			Token t = ts.nextToken();
			if(t == null) {
				System.out.println("Null");
			}
			System.out.println(t.toString());
			counter++;
		}
	}
}
