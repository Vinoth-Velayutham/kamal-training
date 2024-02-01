package arrays;

public class ArraysJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 15;
		int c = 20;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		int arr[] = new int[4];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		int trr[] = { 99, 98, 97, 96, 55, 56 };

		System.out.println(trr[0]);
		System.out.println(trr[3]);
		System.out.println(trr[2]);
		System.out.println(trr[1]);

		double dec[] = { 11.1, 12.1, 13.1 };

		System.out.println(dec[1]);

		double arra[] = { 12, 11, 13, 15, 27, 48 };
		System.out.println("################");

		System.out.println(arra.length);

		for (int i = 0; i < arra.length; i++) {
			System.out.println(arra[i]);
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$");
		
		for(double single : arra) {
			System.out.println(single);
		}

	}

}
