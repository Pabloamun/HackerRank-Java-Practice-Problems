package dataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();

		BitSet b1 = new BitSet(n);
		BitSet b2 = new BitSet(n);

		while (m-- > 0) {
			String op = in.next();
			int p1 = in.nextInt();
			int p2 = in.nextInt();

			if (op.equals("AND") || op.equals("OR") || op.equals("XOR")) {
				if (p1 == 1)
					switch (op) {
					case "AND":
						if (p2 == 1)
							b1.and(b1);
						else
							b1.and(b2);
						break;
					case "OR":
						if (p2 == 1)
							b1.or(b1);
						else
							b1.or(b2);
						break;
					case "XOR":
						if (p2 == 1)
							b1.xor(b1);
						else
							b1.xor(b2);
					}
				else
					switch (op) {
					case "AND":
						if (p2 == 1)
							b2.and(b1);
						else
							b2.and(b2);
						break;
					case "OR":
						if (p2 == 1)
							b2.or(b1);
						else
							b2.or(b2);
						break;
					case "XOR":
						if (p2 == 1)
							b2.xor(b1);
						else
							b2.xor(b2);
					}
			} else
				switch (op) {
				case "FLIP":
					if (p1 == 1)
						b1.flip(p2);
					else
						b2.flip(p2);
					break;
				case "SET":
					if (p1 == 1)
						b1.set(p2);
					else
						b2.set(p2);
				}
			System.out.println(b1.cardinality() + " " + b2.cardinality());
		}
		in.close();
	}
}
