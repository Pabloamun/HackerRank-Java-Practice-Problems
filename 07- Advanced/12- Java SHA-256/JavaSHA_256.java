package advanced;

import java.util.*;
import java.security.MessageDigest;
import javax.xml.bind.DatatypeConverter;

public class JavaSHA_256 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
		sc.close();
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] b = digest.digest(data.getBytes("UTF-8"));
			String hash = DatatypeConverter.printHexBinary(b);
			System.out.print(hash.toLowerCase());
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}