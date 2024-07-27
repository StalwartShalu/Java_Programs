package SamplePackage;

public class SortArrayinDescending {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[] array = { 9,1, 0, 7, 9, 10, 0 };
			SortArrayinDesc(array);

		}

		private static void SortArrayinDesc(int[] array) {
			// TODO Auto-generated method stub
			int temp = 0;
			for(int i =0; i<array.length; i++) {
				for(int j =i+1; j<array.length; j++) {
					if(array[i]<array[j]) {
						 temp = array[i];    
		                   array[i] = array[j];    
		                   array[j] = temp;  
					}
				}
			}
			for(int i =0; i<array.length; i++) {
				System.out.println(array[i]);
			}
		}
	}
