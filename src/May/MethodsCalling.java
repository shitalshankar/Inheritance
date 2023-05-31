package May;

public class MethodsCalling {
	public static void m1() {
		System.out.println("Static method called in non static method");
		
	}
public void m2() {
	m1();
}
public static void main(String[] args) {
	MethodsCalling ob = new MethodsCalling();
ob.m2();
	}
}

