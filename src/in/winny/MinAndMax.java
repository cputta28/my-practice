package in.winny;

import java.util.Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int arr[] = { 23, 154, 43, 24, 1, 5, 43, 56 };
		Arrays.sort(arr);
		System.out.println(arr[0]);// min
		System.out.println(arr[arr.length - 1]);// max

	}

}
