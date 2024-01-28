package code;

import java.util.Arrays;

public class ReverseStringTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1 = "Chennai";

		char S2[] = S1.toCharArray();

		int low = 0;
		int high = S1.length() - 1;

		while (low < high) {
			char temp;
			temp = S2[low];
			S2[low] = S2[high];
			S2[high] = temp;
			low++;
			high--;
		}
		String reverse = new String(S2);
		System.out.println(reverse);
		System.out.println(Arrays.toString(S2));
	}

}
