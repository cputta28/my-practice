package in.basics;

public class WithoutSortMinMax {

	public static void main(String[] args) {

		int arr[] = { 76, 34, 64, 65, 3, 6, 235, 56 };
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
