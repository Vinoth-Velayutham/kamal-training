package code;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Orange");
		list1.add("Banana");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Carrot");
		list2.add("Tomato");
		list2.add("Potato");
		
		System.out.println(list1.containsAll(list2));
		
		System.out.println(list1);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		

		
	}

}
