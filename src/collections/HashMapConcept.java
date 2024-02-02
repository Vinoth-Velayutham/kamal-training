package collections;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> attendance = new HashMap<Integer, String>();
		attendance.put(23, "Tom");
		attendance.put(33, "Pandaya");
		attendance.put(7, "Dhoni");
		attendance.put(18, "Kolhi");
		attendance.put(1, "Sachin");
		attendance.put(8, "Dhoni");
		
		
		System.out.println(attendance.get(7));
		System.out.println(attendance.get(8));
		
		System.out.println(attendance.size());
		
		System.out.println(attendance);
		attendance.remove(8);
		System.out.println(attendance);

	}

}
