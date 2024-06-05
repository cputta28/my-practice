package in.basics;
    
public class VariableExamples {
	
	int a;//instance variable
	static int b=18;// Static variable
	
	public static void main(String[] args) {
		
		
		  VariableExamples ab=new VariableExamples(); //creating object for instance variable
		  ab.a=20;//initializing value to the instance variable
		
		  System.out.println(ab.a);//printing instance data
		  String name="SriRama";// Local variable
			System.out.println(name);
		VariableExamples.b=25;
			  System.out.println(b);//printing static data using class name
	}
	

}
