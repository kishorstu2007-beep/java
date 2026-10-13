package atm;

public class Method {
	void instance(int a , int b) {
		System.out.println(a+b);
	}
	public static void add(int c , int d) {
		System.out.println(c+d);
		
	}
	public static void main(String[]args) {
		Method bb = new Method();
		bb.instance(2,3);
		add(9,7);
		
		
		
	}
	

}
