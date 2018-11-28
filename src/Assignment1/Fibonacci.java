package Assignment1;
public class Fibonacci
{
public static void main(String[] args)
{

 long start = System.currentTimeMillis();
 System.out.println("Recursive");
 System.out.println("Time : " + ((start) / 1000));

 System.out.println("The first 50 numbers in " +
                      "the Fibonacci series are:\n\n");

   for (int i = 0; i < 51; i++)
   {
   System.out.print ("Fibonacci#" + i  + " ");
   
   System.out.print("-->  " + fib(i) + "     ");
   System.out.println();
   }  
}

public static int fib(int n)
{
	if (n == 0)  return 0;
	if (n == 1)  return 1;
	else
		return fib(n-1) + fib(n-2);
}
}
