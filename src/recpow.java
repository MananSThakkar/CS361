import java.io.*;
import java.util.*;

public class recpow {
	
	public static int recPow(int n) {
		
		
		if(n<=0) {
			return 1;
		} else
		return (int) Math.pow(2, n) ;
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count the power with base 2: ");
		int n=sc.nextInt();
		int result = recPow(n);
		System.out.println("Base 2 power "+n+ " is: " + result);
		System.out.println();
		

	}

}
