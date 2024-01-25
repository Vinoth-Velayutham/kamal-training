package inheritance;

public class ShowRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		brouher();
		
		Tata obj = new Tata();
		obj.buildQuality();
		obj.reliability();
		
		Honda obj1 = new Honda();
		obj1.engineRefinement();
		obj1.price();
		
		obj.stearing();
		obj1.engine();
		System.out.println("the wheel count - "+obj.wheel);
		
		
	}
	
	public static void brouher() {
		System.out.println("ShowRoom - Price & model");
	}

}
