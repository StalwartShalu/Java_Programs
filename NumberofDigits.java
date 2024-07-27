package SamplePackage;

import java.util.Scanner;

public class NumberofDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
//		String str = Integer.toString(num);
//		System.out.println(str.length());

		while (num > 0) {
			count++;
			int quo = num;
			int rem = quo % 10;
			quo = quo / 10;
			num = quo;
		}
		System.out.println(count);

	}
}