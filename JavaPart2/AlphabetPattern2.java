package JavaPart2;

public class AlphabetPattern2 {

	public static void main(String[] args) {
		//Pyramid Alphabet
		
		int lines= 7;
		int count=1; 
		
		for(int i = 65; count<=lines; i++) {
			for(int j= lines+1; j>=count; j--) {
				System.out.print(" ");
			}
			
			for(int k= 65; k<=i; k++) {
				System.out.print((char)k + " ");
			}
			System.out.println(" ");
			count++;
		}

	}

}
