package in.winny;

public class PerfectNumber {

	public static void main(String[] args) {
		int number = 6;// 6,28,496,8128,33550336 those all are PerfectNumbers
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
                
		if (number == sum) {
			System.out.println(sum + ":-PerfectNumber");
		} else {
			System.out.println(sum + " :- Not PerfectNumber");
		}

	}

}
