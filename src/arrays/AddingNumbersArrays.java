package arrays;

public class AddingNumbersArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int trr[] = { 99, 98, 97, 96, 55, 56 };

		int sum = 0;
		for (int i = 0; i < trr.length; i++) {
			//sum = sum + trr[i];
			sum += trr[i];
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}
