package SCANNER_PARSER;


/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "TEST.jay";
	private static String file2 = "prog.jay";
	private static String file3 = "prog1.jay";
	private static int counter1 = 1;
	private static int counter2 = 1;
	private static int counter3 = 1;

	public static void main(String args[]) {

		TokenStream ts1 = new TokenStream(file1);

		System.out.println("------------------");
		System.out.println(file1);
		System.out.println("------------------");

		while (!ts1.isEndofFile()) {
			System.out.print("Token " + counter1 + " : ");
			Token t = ts1.nextToken();
			if(t == null) {
				System.out.println("Null");
			}
			System.out.println(t.toString());
			counter1++;
		}
		
		TokenStream ts2 = new TokenStream(file2);

		System.out.println("------------------");
		System.out.println(file2);
		System.out.println("------------------");

		while (!ts2.isEndofFile()) {
			System.out.print("Token " + counter2 + " : ");
			Token t = ts2.nextToken();
			if(t == null) {
				System.out.println("Null");
			}
			System.out.println(t.toString());
			counter2++;
		}
		
		TokenStream ts3 = new TokenStream(file3);

		System.out.println("------------------");
		System.out.println(file3);
		System.out.println("------------------");

		while (!ts3.isEndofFile()) {
			System.out.print("Token " + counter3 + " : ");
			Token t = ts3.nextToken();
			if(t == null) {
				System.out.println("Null");
			}
			System.out.println(t.toString());
			counter3++;
		}
	}
}
