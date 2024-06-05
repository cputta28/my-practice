package in.winny;

public class CountingNumbers {
	public static void main(String[] args) {
		long i = 123456868968l; 
		String str="sghgd";

		// Approach 1 
		//String str1=Integer.toString(i);
		//System.out.println(str.length());

		// Approach 2
		int count = 0;
		while (i > 0) {
			count++;
			i = i / 10;
		}
		System.out.println( count);
	}
}
