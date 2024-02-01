package code;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String shape = "*";

//		for (int i = 7; i >= 0; i--) {
//			for (int j = i; j >= 0; j--) {
//				System.out.print(shape);
//			}
//			System.out.println();
//		}

		for (int i = 0; i <= 8; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}

	}

}
