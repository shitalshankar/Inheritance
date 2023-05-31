package May;

public class NonStaticVariableCheck {
	int a = 20;
	public void m1() {
		int a=200;
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		NonStaticVariableCheck ob = new NonStaticVariableCheck();
		ob.m1();
	}

}
