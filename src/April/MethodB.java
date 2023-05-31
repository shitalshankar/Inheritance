package April;

public class MethodB {
	int a=10;//non-static/instance global variable
	static int b=50;//static/ class global variable
	
	public void test() {
	
	System.out.println("Hello");
	System.out.println(b);
	System.out.println(a);
	}
	public void demo() {
		System.out.println("demo");
		System.out.println(b);
		System.out.println(a);
	}
	public static void hi() {
		System.out.println("Hi everyone");
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(b);
		MethodB obj = new MethodB();
		System.out.println(obj.a);

	}

}
