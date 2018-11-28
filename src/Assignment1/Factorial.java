package Assignment1;
public class Factorial {

	public static long fact(long n) {
		if (n >= 0 ) {
			if (n == 0) {
				return 1;
			} else {
				return n * fact(n - 1);
			}
		} else {
			throw new IllegalArgumentException("n has to be >= 0 and <= 12");
		}
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// System.out.println("fact ( -8 ) = " + fact(-8));

		for (int i = 0; i < 101; i++) {
			System.out.println("fact ( " + i + " ) = " + fact(i));

		}

	}
	
	public static int tailfact(int n,int x) {
		if(n==0)
			return x;
		else 
			return tailfact(n-1, n*x);
		}

}