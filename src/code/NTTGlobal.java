package code;

public class NTTGlobal {
	
	static int x = 1111;
	static {
	x = x-- - --x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		

	}

}
