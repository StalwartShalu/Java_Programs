package SamplePackage;

import java.util.Scanner;

public class CountCharacterOccurrence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		System.out.println("Enter the character to find its occurrence");
		String c = sc.nextLine();

		int result = input.length() - input.replaceAll(c, "").length();
		System.out.println("Character " + c.toUpperCase() + " has occured " + result + " times ");

	}

}
