package JavaPrograms;

public class $13_AnagramString {
	 public static void main(String[] args) {
         String str =  "listen";
         String str1 = "silent";
        int count =0;
        int count1 = 0;
         if(str.length() == str1.length()){
             for(int i =0; i<str.length(); i++){
                 for(int j = 0; j<str1.length(); j++){
                     if(str.charAt(i) == (str1.charAt(j))){
                         count++;
                     }
                 }
                 for(int k = 0; k<str.length(); k++){
                     if(str.charAt(i) == (str.charAt(k))){
                         count1++;
                     }
                 }
             }
             if(count == count1){
                 System.out.println("Anagram");
             }else{
                 System.out.println("NotAnagram");
             }
         }else{
                 System.out.println("NotAnagram");
             }
    }
}
