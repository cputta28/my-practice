package in.winny;

public class MinAndMaxWithoutSort {
 
	public static void main(String[] args) {
		
		int arr[] = { 24, 54, 63, 354, 35, 3, 57, 78 };
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
  
			}

			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println(min);
		System.out.println(max);

	}

}
