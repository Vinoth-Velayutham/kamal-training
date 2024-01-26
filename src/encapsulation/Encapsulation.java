package encapsulation;

public class Encapsulation {

	private static int amount;
	
	public static int getAmount() {
		return amount;
	}

	public static void setAmount(int amount) {
		Encapsulation.amount = amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setAmount(1000);
		System.out.println("Account Balance - " + getAmount());
		setAmount(1000-100);
		System.out.println("Account Balance - " + getAmount());
	}

}
