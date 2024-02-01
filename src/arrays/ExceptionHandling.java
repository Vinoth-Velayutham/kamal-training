package arrays;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];

		try {
			arr[6] = 10;
			System.out.println(arr[6]);
		} catch (Exception e) {
			System.out.println("You got an exeption");
		}
		
		//Modifiers - Public, protected,private

	}

}
