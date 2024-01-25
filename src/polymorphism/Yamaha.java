package polymorphism;

public class Yamaha extends Bikes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wheel();
		twoWheeler(5);
	}

	// Method Over-riding or compile time Polymorphism
	public static void wheel() {
		System.out.println("***Yamaha Wheel****");
	}

	//Method OverLoading or Runtime polymorphism
	public static void twoWheeler(int gear) {
		System.out.println("FZ has " + gear + " Gears");
	}

	public static void twoWheeler() {
		System.out.println("Fazino has no Gears");
	}

}
