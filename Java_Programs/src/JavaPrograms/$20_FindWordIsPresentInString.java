package JavaPrograms;

public class $20_FindWordIsPresentInString {
    public static void main(String[] args) {

        String str = "I love Selenium Webdriver";
        String sub = "Selenium Web";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == sub.charAt(0) && str.substring(i, sub.length()+i).equals(sub)){
                System.out.println(true);
                System.out.println(sub);
            }
        }
    
	}
}
