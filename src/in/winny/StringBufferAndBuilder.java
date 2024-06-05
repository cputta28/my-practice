package in.winny;

public class StringBufferAndBuilder {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		StringBuffer br = new StringBuffer("Chandra");
		for (int i = 0; i < 5; i++) {
			br.append("Shekar");

		}
		System.out.println("Buffer:" + (System.currentTimeMillis() - startTime + "ms"));
		System.out.println(br);
		System.out.println("******************************************");
		startTime = System.currentTimeMillis();
		StringBuilder br1 = new StringBuilder("Chandra");
		for (int i = 0; i < 5; i++) {
			br1.append("Shekar");

		}
		System.out.println("Builder:" + (System.currentTimeMillis() - startTime + "ms"));
		System.out.println(br1);
	}

}
