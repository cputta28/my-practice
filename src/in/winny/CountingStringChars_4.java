package in.winny;

public class CountingStringChars_4 {

	public static void main(String[] args) {
		String str = "ChandraShekar";
		// System.out.println(str.length());

		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;

			}

		}

		System.out.println(count);
	}
}