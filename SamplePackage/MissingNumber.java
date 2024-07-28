package SamplePackage;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = { 81, 82, 83, 85, 84, 87, 89, 91 };
		Arrays.sort(arr);
		int count = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == count) {
				count = count + 1;
			} else {
				count=arr[i]+1;
				System.out.println("Missing Number is: " + (arr[i] - 1));
			}
		}
	}
}
