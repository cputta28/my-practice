package in.basics;

import java.util.Arrays;

public class NonRepeatedElements {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 1, 4, 2, 5, 6, 7, 4 };

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			Arrays.sort(arr);
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(arr[i] + " ");
			}
		}

	}

}
