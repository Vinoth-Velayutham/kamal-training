package arrays;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Apple,Orange,Banana,Mango,Cucumber";
		
		String fruits[] = str.split(",");
		
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		

	}

}
