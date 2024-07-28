package SamplePackage;

public class LargestElement {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 0, 0, 99, 100 };
		
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		System.out.println("Largest Element is: " + max);

		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Smallest Element is: " + min);
	}

}