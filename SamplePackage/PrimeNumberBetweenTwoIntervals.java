package SamplePackage;

import java.util.Scanner;

public class PrimeNumberBetweenTwoIntervals {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int start = sc.nextInt();
			int end = sc.nextInt();

			if (start == 0 && end == 1) {
				System.out.println("1 is neither prime nor composite");
			}

			if (start < 0 || end < 0) {
				System.out.println("Invialid Inputs");
			}

			for (int i = start; i <= end; i++) {
				boolean isPrime = true;
				for (int j = 2; j <i; j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					System.out.println(i);
				}
			}

		}

	}

}
