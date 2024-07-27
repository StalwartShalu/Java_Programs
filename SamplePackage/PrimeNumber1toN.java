package SamplePackage;
import java.util.*;

public class PrimeNumber1toN{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	if(num<=1) {
		System.out.println("Not a Prime Number");
	}
	
	for(int i = 2; i<=num; i++) {
		boolean isPrime = true;
		for(int j =2; j<=i/2; j++) {
			if(i%j==0) {
				isPrime = false;
				break;
			}
		}
	if(isPrime) {
		System.out.println(i);
	}
	}
	}
}
	