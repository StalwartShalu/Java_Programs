package JavaPart2;

public class NumberPattern1 {

	public static void main(String[] args) {
		//Pyramid Number
		
		int lines= 5;
		for(int i = 1; i<=lines; i++) {
			for(int j= lines+1; j>=i; j--) {
				System.out.print(" ");
			}
			
			for(int k= 1; k<=i; k++) {
				System.out.print(k + " ");
			}
			System.out.println(" ");
		}

	}

}
