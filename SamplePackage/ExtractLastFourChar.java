package SamplePackage;

public class ExtractLastFourChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "FirstString";
		String outputStr = "";

		for (int i = str.length() - 1; i > 0; i--) {
			outputStr = outputStr + str.charAt(i);

		}

		for (int i = 0; i <= 3; i++) {
			System.out.println(outputStr.charAt(i));
		}

	}

}
