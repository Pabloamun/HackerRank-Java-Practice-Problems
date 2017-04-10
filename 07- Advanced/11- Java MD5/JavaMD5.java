package advanced;

import java.util.*;
import java.security.*;
import javax.xml.bind.DatatypeConverter;

public class JavaMD5 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(input.getBytes());
			byte[] digestBytes = md.digest();
			String hashValue = DatatypeConverter.printHexBinary(digestBytes)
					.toLowerCase();
			System.out.println(hashValue);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			in.close();
		}
	}
}