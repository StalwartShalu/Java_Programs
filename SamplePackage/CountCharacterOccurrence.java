package SamplePackage;

import java.util.Scanner;

public class CountCharacterOccurrence {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		System.out.println("Enter the character to find its occurrence");
		Thread.sleep(1000);
		String c = sc.nextLine();
		int result = input.length() - input.replaceAll(c, "").length();
		System.out.println("Character " + c.toUpperCase() + " has occured " + result + " times ");

	}

}
