package SamplePackage;

public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 9, 0, 7, 9, 10, 0 };
		duplicateArray(array);

	}

	private static int duplicateArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println("Duplicates Found: " + array[i]);
				}
			}
		}
		return 0;
	}

}
