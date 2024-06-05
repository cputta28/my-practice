package in.winny;

public class PalindromeNumber {
	public static void main(String[] args) {
		int num=22222;
		int rem=0;
		int rev=0;
		int temp=num;
		while ( temp!=0) {
			rem=temp%10;
			rev=rev*10+rem; 
			temp=temp/10;
			
		}
		 System.out.println(rev) ;
		if(num==rev) {
			System.out.println("This is Palindrome Number:-"+rev);
		}
		else {
			System.out.println("This is not Palindrome:-"+rev);
		}
			
			
		 }
	}


