package exceptionHandling;

import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		try (Scanner sc = new Scanner(System.in)) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.print(num1 / num2);
		} catch (ArithmeticException ae) {
			System.out.print(ae);
		} catch (Exception e) {
			System.out.print(e.getClass().getName());
		}
	}
}
