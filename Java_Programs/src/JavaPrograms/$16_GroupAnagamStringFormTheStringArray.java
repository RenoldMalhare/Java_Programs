package JavaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class $16_GroupAnagamStringFormTheStringArray {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();
        String ar[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        for(int i=0; i<ar.length; i++){
            char[] chars = ar[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            
            map.get(sorted).add(ar[i]);
        } 
        for(List<String> e: map.values()){
            System.out.println(e);
        }
    }
}
