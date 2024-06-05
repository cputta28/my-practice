package in.basics;

public class IfExamples {

	public static void main(String[] args) {

		int a = 20;
		int b = 20;
		int c = a + b;
		if (b > c) {
			System.out.println("this is  true");
		} else {
			System.out.println("this is false");
		}

		String city = "Noida";
		if (city == "Meerut") {
			System.out.println("city is meerut");
		} else if (city == "Noida") {
			System.out.println("city is noida");
		} else if (city == "Agra") {
			System.out.println("city is agra");
		} else {
			System.out.println("city not matched");

			int d = 10;
			int e = 20;
			if (e == a) {
				System.out.println("city is meerut");
			} else if (d > e) {
				System.out.println("city is noida");
			} else if (a >= b) {
				System.out.println("city is noida");
			} else {
				System.out.println("city not matched");
			}
		}
	}
}
