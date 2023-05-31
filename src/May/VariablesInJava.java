package May;

public class VariablesInJava {
	static int a=20; // static variable
	int b = 50; // non static variable
	
	public void m1() {
		System.out.println(b);
	}
	public static void main(String[] args) {
		VariablesInJava ob = new VariablesInJava();
		int c = a+ob.b; // local variable
		System.out.println(c);
		ob.m1();
		
	}

}
