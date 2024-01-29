package loops;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exist Check loop
		
		String S1 = "Hi kamal";

		boolean condition = false;
		
		int count = 0;
		
		do {
			System.out.println(S1);
			count++;
			if(count == 10) {
				break;
			}
		}while(condition);

	}

}
