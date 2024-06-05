 package in.winny;

public class SquaresOfArray {
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,7,8,9};
		int b[]= new int [a.length];
		for (int i = 0; i < b.length; i++) {
			int c=a[i]*a[i];
			b[i]=c;
		}
		for( int c:b) {
			System.out.println (c);
		}
	}

}
