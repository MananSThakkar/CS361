package Assignment1;


public class GCD {

	static int gcd(int n, int m) {
		if (m==n) {
			return m;
		}
		if(m>n) {
			return gcd(m-n, n);
		}
		return gcd(m, n-m);
	}


public static void main(String[] args) {
	int m = 20 ;
	int n =30;
			
	System.out.println("GCD of " +m+ " and " +n+ " is " + gcd(m,n));
}
}