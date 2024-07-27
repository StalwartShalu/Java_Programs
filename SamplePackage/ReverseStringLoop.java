package SamplePackage;

import java.util.Scanner;

public class ReverseStringLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("----------Reverse a String----------");
		System.out.println("Original String: ");
		String str = sc.nextLine();
		String nstr = "";
		for(int i=0; i<str.length(); i++) {
			char output= str.charAt(i);
			nstr= output+nstr;
		}
		System.out.print("Reversed String: " +nstr);

	}

}
