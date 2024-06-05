import java.util.HashMap;
import java.util.Map;

public class ConvertingStringToHashMAp {

	public static void main(String[] args) {

		String student = "Aashish:1, Bina:2, Chintu:3";

		Map<String, String> hashMap = new HashMap<String, String>();

		String parts[] = student.split(",");

		for (String part : parts) {

			String stuData[] = part.split(":");

			String stuRollNo = stuData[0].trim();
			String stuName = stuData[1].trim();

			hashMap.put(stuRollNo, stuName);
		}

		System.out.println("String to HashMap: " + hashMap);
	}

}
