package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] L = new int[N];
		for (int i = 0; i < N; i++) {
			L[i] = scan.nextInt();
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < L.length; i++) {
			list.add(L[i]);
		}
		int Q = scan.nextInt();
		while (Q > 0) {
			String query = scan.next();
			if (query.equals("Insert")) {
				int index = scan.nextInt();
				int value = scan.nextInt();
				list.add(index, value);
			} else if (query.equals("Delete")) {
				int index = scan.nextInt();
				list.remove(index);
			}
			Q--;
		}
		for (Integer number : list) {
			System.out.print(number + " ");
		}
		scan.close();
	}
}
