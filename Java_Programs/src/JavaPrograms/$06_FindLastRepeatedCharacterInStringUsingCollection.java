package JavaPrograms;

import java.util.LinkedHashMap;

public class $06_FindLastRepeatedCharacterInStringUsingCollection {
    public static void main(String[] args) {
        String str  = "automation";
        char last ='1';
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        for(char c : map.keySet()){
            if(map.get(c)>1){
                last = c;
            }
        }
        System.out.println(last);
    }
}
