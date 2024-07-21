package SamplePackage;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// Find number of digits- p
		// power each number with p
		// 789

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		int inputNum = num;
		int sum = 0;
		String numString = Integer.toString(num);
		int len = numString.length();
		for (int i = 0; i < len; i++) {
			int rem = num % 10;
			int quo = num / 10;
			sum = (int) (sum + Math.pow(rem, len));
			num = quo;
		}
		if (sum == inputNum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}

}
