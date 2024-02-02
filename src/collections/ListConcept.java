package collections;

import java.util.ArrayList;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList lis = new ArrayList<Integer>();
		lis.add(23);
		lis.add(25);
		lis.add(27);
		lis.add(87);
		lis.add(57);
		
		System.out.println(lis);
		
		System.out.println(lis.get(0));
		
		System.out.println(lis.size());
		
		lis.add(33);
		
		System.out.println(lis.size());
		
		lis.remove(3);
		System.out.println(lis);
		System.out.println(lis.size());
		ArrayList agee = new ArrayList<Integer>();
		agee.add(66);
		agee.add(67);
		agee.add(68);
		
		lis.addAll(agee);
		
		System.out.println(lis);
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Tata");
		cars.add("Honda");
		cars.add("Suzuki");
		cars.add("Suzuki");
		
		System.out.println(cars);
		System.out.println(cars.get(0));
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		//car
		

	}

}
