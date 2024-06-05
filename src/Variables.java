 
public class Variables {
//	instance or global  variables/ inside class out side method /initialization is not mandatory 
	//Object creation mandatory
	int age;
	String name;
//	static variables / inside class out side method with static method /initialization is not mandatory
	static int a=20;

	public static void main(String[] args) {
		//Variables.a=1;
		System.out.println(a);
		Variables variables = new Variables();
		variables.age = 13;
		variables.name = "vishnu";
		System.out.println("name:-" + variables.name +  "  :  " +"age:-" + variables.age );
		
//		Local variables /inside method, constructor or block / initialization is mandatory
		int b = 23;
		System.out.println(b);
	}
}
