package JavaPrograms;

public class $10_SubStringConnectingEnds {
    public static void main(String[] args) {
        String str = "keerthana";
        int start = 0; 
        int end = 3;
        while(end<=str.length()){
            String data =str.substring(start,end);
            System.out.println(data);
            start+=2;
            end+=2;
        }
    }
}
