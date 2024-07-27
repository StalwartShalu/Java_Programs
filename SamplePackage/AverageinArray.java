package SamplePackage;

public class AverageinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] NewArray = { 1, 2, 9, 4, 5 };
		int sum = 0, Average;
		for (int i = 0; i < NewArray.length; i++) {
			sum = sum + NewArray[i];
		}
		
		Average=sum/NewArray.length;
		System.out.println(Average);

	}

}
