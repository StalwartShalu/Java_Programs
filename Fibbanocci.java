package SamplePackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibbanocci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("Enter Postive Integer");
		}

		else if (n > 0 && n < 3) {
			System.out.print("[0, 1]");
		}

		else {
			int a = 0;
			int b = 1;
			List<Integer> list = new ArrayList<Integer>();
			list.add(a);
			list.add(b);
			for (int i = 0; i < n - 2; i++) {
				int c = a + b;
				list.add(c);
				a = b;
				b = c;
			}
			System.out.println(list);
		}
		sc.close();
	}
}