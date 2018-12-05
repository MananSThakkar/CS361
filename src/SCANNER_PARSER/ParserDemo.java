package SCANNER_PARSER;
public class ParserDemo {
	// Test files. comment one out to use another.
	private static String file1 = "prog2.jay";
//	private static String file1 = "prog3.jay";
//	private static String file1 = "prog4.jay";
//	private static String file1 = "prog5.jay";
//	private static String file1 = "prog6.jay";
//	private static String file1 = "prog7.jay";
	

	public static void main(String[] args) {
		TokenStream tStream1 = new TokenStream(file1);
		System.out.println("test1");
		ConcreteSyntax cSyntax1 = new ConcreteSyntax(tStream1);
		System.out.println("test2");
		Program p1 = cSyntax1.program();
		System.out.println(p1.display());
		System.out.println("test");
		
	}

}
