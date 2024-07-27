package SamplePackage;

import java.util.Scanner;

public class Palindrome_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Palindrome Check-----");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Original String");
		String inputstr = sc.nextLine();
		StringBuilder input = new StringBuilder();
		input.append(inputstr);
		StringBuilder reverStr = input.reverse();
		String ReverseStr = reverStr.toString();
		if(inputstr.equalsIgnoreCase(ReverseStr)) {
			System.out.println("Its a Palindrome");
		}
		else { 
			System.out.println("Its not a Palindrome");
		}

	}

}
