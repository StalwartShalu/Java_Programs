package SamplePackage;

public class Anagram {

	public static void main(String[] args) {

		String str1 = "army";
		String str2 = "ARMY";

		char[] charArray1 = str1.toLowerCase().toCharArray();
		char[] charArray2 = str2.toLowerCase().toCharArray();

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < charArray1.length; i++) {
			sum1 = sum1 + charArray1[i];
			sum2 = sum2 + charArray2[i];
		}

		if (sum1 == sum2) {
			System.out.println("Given string are an Anagram");
		} else {
			System.out.println("Given string are not an Anagram");
		}
	}
}
