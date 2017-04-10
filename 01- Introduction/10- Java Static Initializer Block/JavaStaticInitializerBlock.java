package introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
	static boolean flag;
	static Scanner in = new Scanner(System.in);
	static int B = in.nextInt();
	static int H = in.nextInt();
	static {
		if (B > 0 && H > 0) {
			flag = true;
		} else {
			System.out
					.print("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}
}
