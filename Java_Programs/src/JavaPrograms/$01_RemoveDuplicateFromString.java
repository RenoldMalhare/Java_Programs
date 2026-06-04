package JavaPrograms;

public class $01_RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "automation";
		String unique = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = 1;
				}
			}
		}
		for (char c : arr) {
			if (c != 1) {
				unique += c;
			}
		}
		System.out.println(unique);
	}
}
