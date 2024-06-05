package in.winny;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencessOfString_2 {

	public static void main(String[] args) {
		 String name="jgklkjhfk";
		 Map<Character, Integer>map= new HashMap<>();
		 char[]chars=name.toCharArray();
		 for(char ch:chars) {
			 if(!map.containsKey(ch)) {
				 map.put(ch, 1);
				 
			 }else {
				int value=map.get(ch);
				map.put(ch, value+1); 
			}
		 }
		 System.out.println(map);
	}

}
