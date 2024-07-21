package SamplePackage;

import java.util.Scanner;

public class CountCharacters {
	
	public static void main(String args[]) {
		String inputStr = "I Love Java";
		String inputArray[]  = inputStr.split(" ");
		for(int i= 0; i<inputArray.length; i++) {
			System.out.printf("%s - %d \n", inputArray[i], inputArray[i].length());
		}
		
	}
	

}
