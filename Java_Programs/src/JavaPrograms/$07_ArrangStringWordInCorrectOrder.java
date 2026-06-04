package JavaPrograms;

public class $07_ArrangStringWordInCorrectOrder {
    public static void main(String[] args) {
        String str = "Am3 Hi1 I2 King4";//input
        String arr[] = str.split(" ");
        String ar[] = new String[arr.length];
        for(String s : arr){
            int posi = s.charAt(s.length()-1) - 49;     
            ar[posi]=s.substring(0,s.length()-1);
        }
        for(String st : ar){
            System.out.print(st+" ");
        }
    }
}
