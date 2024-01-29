package loops;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Entry check loop
		// Condtion fail
		// break;

		String S1 = "Hi kamal";

		boolean condition = false;
		
		int count = 0;

		while (condition) {
			System.out.println(S1);
			count++;
			System.out.println(count);
			if(count == 10) {
				condition = false;
			}
		}

	}

}
