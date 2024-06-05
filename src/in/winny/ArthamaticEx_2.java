package in.winny;

public class ArthamaticEx_2 {

	public static void main(String[] args) {
		 try {
			 int a=15/0;
			 System.out.println(a);
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e);
		}
		 finally {
			System.out.println("This is finally block");
		}

	}

}
