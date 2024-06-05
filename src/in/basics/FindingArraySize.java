package in.basics;

public class FindingArraySize {

	public static void main(String[] args) {
		int arr[] = new int[5];

		arr[0] = 100;
		arr[1] = 101;
		arr[2] = 102;
		arr[3] = 103;
		arr[4] = 104;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
			System.out.println(arr[5]);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(arr[3]);

		System.out.println(arr.length);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
