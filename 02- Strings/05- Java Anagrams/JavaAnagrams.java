package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JavaAnagrams {
	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}
		// Complete the function by writing your code here.
		ArrayList<Character> A = new ArrayList<>();
		ArrayList<Character> B = new ArrayList<>();
		for (int i = 0; i < a.length(); i++) {
			A.add(a.toLowerCase().charAt(i));
		}
		for (int i = 0; i < b.length(); i++) {
			B.add(b.toLowerCase().charAt(i));
		}
		Collections.sort(A);
		Collections.sort(B);

		for (int i = 0; i < a.length(); i++) {
			if (A.get(0).equals(B.get(0))) {
				A.remove(A.get(0));
				B.remove(B.get(0));
			}
		}
		return A.isEmpty();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}
