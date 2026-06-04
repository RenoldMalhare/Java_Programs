package JavaPrograms;

public class $03_FindFirstRepatedCharacterInString {
    public static void main(String[] args) {
        String str = "indian";
        boolean flag = false;
        for(int i=0; i<str.length()-1; i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    System.out.println(str.charAt(i));
                    flag=true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        
    }
}
