package JavaPart2;

public class AlphabetPattern1 {

	public static void main(String[] args) {

		/*
		 * A AB ABC ABCD (Right Angle Triangle)
		 */

		int lines = 4;
		int count = 1;
		for (int i = 65; count <= lines; i++) {
			for (int j = 65; j <= i; j++) {
				System.out.print((char) j);
			}
			System.out.println("");
			count++;
		}

	}

}
