package introduction;

import java.util.Scanner;

public class JavaEndOfLine {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String s = "";
		int line = 0;

		while (sc.hasNext()) {
			line++;
			s = sc.nextLine();
			System.out.println(line + " " + s);
		}
		sc.close();
	}
}
