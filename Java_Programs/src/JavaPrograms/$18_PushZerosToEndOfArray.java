package JavaPrograms;

public class $18_PushZerosToEndOfArray {
	public static void main(String[] args) {
        int ar[] = {3,2,0,2,0,5,0,7};
        int index =0;
        for(int i=0; i<ar.length; i++){
            if(ar[i]!=0){
               ar[index]= ar[i];
               index++;
            }
        }
        for(int i= index; i<ar.length; i++){
            ar[i]=0;
        }
        for(int e: ar){
            System.out.println(e);
        }
	}
}
