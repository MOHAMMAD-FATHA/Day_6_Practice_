package FibonacciSeriesJava;

public class FibonacciSeries {
		// TODO Auto-generated method stub

		static int n1 = 0, n2 = 1, n3 = 0;

		static void Fibonacci(int count) 
		{
			if (count > 0) 
			{
				n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.print(" " + n3);
				Fibonacci(count - 1);
			}
		}

		public static void main(String args[]) 
		{
			int count = 1;
			System.out.print(n1 + " " + n2);// printing 0 and 1
			Fibonacci(count - 2);// n-2 because 2 numbers are already printed
		
	}

}
