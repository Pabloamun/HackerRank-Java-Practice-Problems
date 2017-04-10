package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaStringCompare {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String S = in.next();
		int k = in.nextInt();

		ArrayList<String> list_k = new ArrayList<>();

		for (int i = 0; i < S.length() - k + 1; i++) {
			list_k.add(S.substring(i, k + i));
		}
		Collections.sort(list_k);
		Object[] result = list_k.toArray();
		System.out.println(result[0]);
		System.out.println(result[result.length - 1]);
		in.close();
	}
}
