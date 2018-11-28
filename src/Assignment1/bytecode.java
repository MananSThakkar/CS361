package Assignment1;

public class bytecode {
	
	public static void main(String args[]){
		int i =5 ;
	i = i+5;
	System.out.println(i);
	
	}
	
	public static int sum_for(int n) {
		int i = 0, sum = 0;
		for (i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sum_while(int n) {
		int i = 0, sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}

}
