package apstraction;

public class KamalBank extends ReserveBank {

	@Override
	public void creditLimit() {
		System.out.println("My Credit limit is 5%");

	}

	@Override
	public void rules() {
		System.out.println("I follow all the guidelines");

	}

}
