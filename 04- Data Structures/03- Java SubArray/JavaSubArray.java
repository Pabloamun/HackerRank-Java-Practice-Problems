package dataStructures;

import java.util.Scanner;

public class JavaSubArray {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int len = in.nextInt(), i = 0, sum, res = 0;
		int[] arr = new int[len];

		while (in.hasNext()) {
			arr[i++] = in.nextInt();
		}
		in.close();
		for (i = 0; i < len; i++) {
			sum = 0;
			for (int j = i; j < len; j++) {
				sum += arr[j];
				if (sum < 0)
					res++;
			}
		}

		System.out.println(res);
	}
}
