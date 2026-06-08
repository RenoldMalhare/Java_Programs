package JavaPrograms;

import java.util.ArrayList;

public class $14_RemoveDuplicateValuesFormArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(20);
        list.add(10);
        ArrayList<Integer> result = new ArrayList();
        for(int a : list){
            if(!result.contains(a)){
                result.add(a);
            }
        }
        for(int a : result){
            System.out.println(a);
        }
   }
}
