package apstraction;

public abstract class ReserveBank {
	
	public abstract void creditLimit();
	
	public abstract void rules();
	
	public void minBalance() {
		System.out.println("Reserve bank Minimum Balance - "+500);
	}

	public void maxBalance() {
		System.out.println("Reserve bank Maximum Balance - "+1 +" Crore.");
	}
}
