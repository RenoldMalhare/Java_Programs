package JavaPrograms;

import java.util.LinkedHashSet;

public class $02_RemoveDuplicateFromStringUsingCollection {
    public static void main(String[] args) {
        String str = "automation";
        String unique = "";
        LinkedHashSet<Character> s = new LinkedHashSet<>();
        for(int i=0; i<str.length(); i++){
            s.add(str.charAt(i));
        }
        for(char c : s){
            unique += c;
        }
        System.out.println(unique);

   }
}
