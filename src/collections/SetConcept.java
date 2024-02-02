package collections;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set price = new HashSet<Double>();

		price.add(33.3);
		price.add(24.5);
		price.add(343.6);
		price.add(77);
		price.add(77);

		System.out.println(price);

		// price.clear();

		System.out.println(price);

		System.out.println(price.contains(24.5));

		if (price.contains(24)) {
			System.out.println("I have this price in the set");
		} else {
			System.out.println("I don't have this price.");
		}
		
		

	}

}
