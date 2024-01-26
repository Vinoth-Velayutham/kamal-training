package datatypes;

public class DataTypes {

	// Integer, Float, Double, Character (a-z) ('k'), Boolean (true / false)
	// String ("Kamal") - Non-Primitive

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		float decimal = (float) 0.5;
		double num = 700;
		char alp = 'V';

		System.out.println(a);
		System.out.println(decimal);
		System.out.println(num);
		System.out.println(alp);
		System.out.println("=============================================");
		// String is im-mutable
		String S1 = "Kamal";
		System.out.println(S1);
		System.out.println(S1.toUpperCase());
		System.out.println(S1.toLowerCase());
		System.out.println(S1.length());
		System.out.println(S1.substring(1, 4));
		String S2 = "*ABCdgfgikgciebwi*";
		System.out.println(S2.substring(1, S2.length() - 1));

		System.out.println(S1.charAt(3));

		// String Comparison
		String S3 = "KaMaL";

		System.out.println(S1.equals(S3));
		System.out.println(S1.equalsIgnoreCase(S3));

		String S4 = "My name is Kamal";

		System.out.println(S4.contains("name"));
		System.out.println(S4.contains("Kamal"));

		String S5 = "   Value   ";
		System.out.println(S5);
		System.out.println(S5.trim());
		
		String S6 = "Tom";
		String S7 = "And";
		String S8 = "Jerry";
		
		System.out.println(S6+S7+S8);
		System.out.println(S6.concat(S8));
		
		System.out.println(S1.indexOf("m"));
		
		System.out.println(S7.isEmpty());
		String S9 = "";
		System.out.println(S9.isEmpty());
		
		//Split
	}

}
