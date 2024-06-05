package in.winny;

public class CountOccurencessOfString {
	public static void main(String[] args) {
		String name="fggkjldhagdkjdskcg";
		int totalCount=name.length();
		 int afterRemove=name.replace( "s", "").length();
		int count=totalCount-afterRemove;
		System.out.println(count);
	}

}
 