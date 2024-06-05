package in.winny;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChars {
	 
	public static void main(String[] args) {
		String str = "RamaNayudu";
		//Approach-1
		StringBuilder sb1=new StringBuilder();
		str.chars().distinct().forEach(c->sb1.append((char)c));
		System.out.println(sb1);
		
		
		System.out.println("*******************");
			//Approach-2
		StringBuilder sb2=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			int idx=str.indexOf(ch,i+1);
			if(idx==-1) {
				sb2.append(ch);
			}
					
		}
		System.out.println(sb2);
		System.out.println("*******************");
		//Approach-3
		char[] arr =str.toCharArray();
		StringBuilder sb3=new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			boolean repeated= false;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					repeated=true;
					break;
					
				}
				
			}
			if(!repeated) {
				 sb3.append(arr[i]);
			}
		}
		System.out.println(sb3);
		System.out.println("*******************");
		//Approach-4
		StringBuilder sb4=new StringBuilder();
		Set<Character> set =new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			}
	     for(Character c:set) {
	    	 sb4.append(c);
	     }
	     System.out.println(sb4);
		
	}

}
