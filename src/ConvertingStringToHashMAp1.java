import java.util.HashMap;
import java.util.Map;

public class ConvertingStringToHashMAp1 {
	public static void main(String[] args) {
		  // String array that contains the student name 
        String stuName[] = { "Aashish", "Bina", "Chintu" }; 
  
        // Integer array that contains roll number of the 
        // students 
        Integer stuRollNo[] = { 1, 2, 3 }; 
  
        // New HashMap obj 
        Map<Integer, String> hashMap 
            = new HashMap<Integer, String>(); 
  
        // Iterating over array of strings 
        for (int i = 0; i < stuName.length; i++) { 
  
            // And set roll no as key and the name as value 
            hashMap.put(stuRollNo[i], stuName[i]); 
        } 
  
        // Printing HashMap 
        System.out.println("String to hashmap: " + hashMap); 
	}
}
