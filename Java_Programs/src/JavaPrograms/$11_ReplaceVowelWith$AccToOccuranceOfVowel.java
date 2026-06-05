package JavaPrograms;

public class $11_ReplaceVowelWith$AccToOccuranceOfVowel {
    public static void main(String[] args) {
        String str = "tomorrow";
        String out = "";
        int count =0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'o'){
                count++;
                for(int j=0; j<count; j++){
                    out= out+ '$';
                }
            }else{
                out+=str.charAt(i);
            }
        }
        System.out.println(out);
   }
}
