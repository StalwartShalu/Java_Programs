package SamplePackage;

public class ReverseWord {

	public static void main(String[] args) {

		String str = "hi hello how are you";
		String[] inputArray = str.split(" ");
		for (int i = inputArray.length - 1; i >= 0; i--) {
			System.out.println(inputArray[i]);
		}

	}

}
