package JavaPrograms;

public class $08_OccuranceOfCharacter {
    public static void main(String[] args) {
        String str = "automation";
        char [] ar = str.toCharArray();
        for(int i=0; i<ar.length; i++){
            int count =1;
            for(int j = 1+i; j<ar.length; j++){
                if(ar[i]==ar[j]){
                    ar[j]='1';
                    count++;
                }
            }
            if(ar[i]!='1'){
                System.out.println(ar[i]+" : "+count);
            }
        }
    }
}
