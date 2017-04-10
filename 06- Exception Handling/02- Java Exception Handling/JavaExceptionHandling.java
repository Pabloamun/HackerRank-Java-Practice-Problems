package exceptionHandling;

import java.util.Scanner;

//Write your code here
class MyCalculator {

	long power(int n, int p) throws Exception {
		long result = 1;
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}
		for (int i = 0; i < p; i++) {
			result *= n;
		}
		return result;
	}
}

public class JavaExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		in.close();
	}
}
