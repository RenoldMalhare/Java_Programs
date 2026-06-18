package JavaPrograms;

import java.util.HashMap;

public class $19_NumOfOccrOfWordInString {
    public static void main(String[] args) {
		String str = "java java selenium java";
		String []a = str.split(" ");
		int count =0; 
		for(String e : a) {
			if(e.equals("java")) {
				count++;
			}
		}
		System.out.println(count);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i =0; i<a.length; i++) {
			String st = a[i];
			if(map.containsKey(st)) {
				map.put(st, map.get(st)+1);
			}else {
				map.put(st, 1);
			}
		}
		
		for(String s1 : a) {
			if(s1.equals("java")) {
				count++;
			}
		}
		System.out.println(count);
		
		String s = "javajavajavaseleniumjava";
		String sub = "java";
     
        for(int i=0; i<s.length()-sub.length(); i++){
            if(s.charAt(i) == 'j' && s.substring(i,sub.length()+i).equals("java")){
                count++;
            }
        }
         System.out.println(count);

	}
}
