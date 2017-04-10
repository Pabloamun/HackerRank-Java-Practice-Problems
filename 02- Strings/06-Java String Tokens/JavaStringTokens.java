package strings;

import java.util.Scanner;

public class JavaStringTokens {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String k = s.trim();
		if (k.length() == 0) {
			System.out.println(0);
		} else {
			String[] solution = k.split("[^a-zA-Z]+");
			System.out.println(solution.length);
			for (int i = 0; i < solution.length; i++) {
				System.out.println(solution[i]);
			}
		}
		scan.close();
	}
}
