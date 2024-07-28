package SamplePackage;

public class ReverseNumber {

	public static void main(String[] args) { 
		int num = 9087654; 
		int len = Integer.toString(num).length();
		
		for(int i= 0; i<len; i++) {
			int rem=num%10;
			System.out.print(rem);
			num = num/10;
		}
		 
		
	}

}
