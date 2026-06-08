package JavaPrograms;

public class $12_SecondLargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {3,5,7,3,9,6};
        int large = Integer.MIN_VALUE;
        int secL = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]> large){
                secL = large;
                large = arr[i];
            }else if(arr[i] != large && arr[i]> secL){
                secL = arr[i];
            }
        }
        System.out.println(secL);
	}
}
