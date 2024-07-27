package SamplePackage;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		// Conventional Method
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

		// Using String Buffer 
		StringBuffer StrBuffer = new StringBuffer(str);
		System.out.println(StrBuffer.reverse());

		// Using String Builder
		StringBuilder StrBuilder = new StringBuilder(str);
		System.out.println(StrBuilder.reverse());

	}
}