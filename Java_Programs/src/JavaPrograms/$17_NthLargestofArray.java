package JavaPrograms;

import java.util.Arrays;

public class $17_NthLargestofArray {
	public static void main(String[] args) {

		int[] ar = { 3, 4, 5, 6, 4, 3,7, 2, 6, 7 };
		int n = 5;
		int count = 0;
		Arrays.sort(ar);
		///34456677

		for (int i = ar.length - 1; i > 0; i--) {
			if (ar[i] > ar[i - 1]) {
				count++;
			}
			if (count == n) {
				System.out.println(ar[i]);
				break;
			}

		}
	}
}
