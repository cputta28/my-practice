package in.winny;

public class ConvertingStringChars_3 {

	public static void main(String[] args) {
		String str = " this is chandhu father of winny ";
		int mid = str.length() / 2;
		String upperCase = "";
		String lowerCase = "";

		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				upperCase = upperCase + Character.toUpperCase(str.charAt(i));
			} else {
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(upperCase +  ":" + lowerCase);
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}

}
