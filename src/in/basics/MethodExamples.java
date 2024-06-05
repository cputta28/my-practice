package in.basics;

public class MethodExamples {
     int a;
     int b;
	 public void greet(int a, int b ) {
		  a=25;
		  b=35;
		 System.out.println("hi");
		  
	 }
	 
	public void getWelcome() {
		System.out.println("Welcome to java");
		 
	}
	 public static void main(String[] args) {
		 MethodExamples methodExamples =new MethodExamples();
		 methodExamples.getWelcome();
		 methodExamples.a=25;
		 methodExamples.b=35;
		 System.out.println(methodExamples.a);
		 System.out.println(methodExamples.b);
	}

	 
	

}
