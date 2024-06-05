
public class Blocks {
	public int a;
    public String b;

	public void m1() {
		a = 23;
		b = "AAAA";
	}

//	instance or non-static block
	{
		System.out.println("Ravi");
	}
	static {
		System.out.println("This is static block");
	}
	  static int d=12345;

	public static void main(String[] args) {
	 

		int e = 35;
		System.out.println(e);
		System.out.println(d);
		Blocks blocks = new Blocks();
		blocks.m1(); 
 
		System.out.println( blocks.a);
		System.out.println(blocks.b);
		{
			int c = 34;
			System.out.println(c);
		}

	}

}
