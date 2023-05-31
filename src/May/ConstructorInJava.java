package May;

public class ConstructorInJava {
	
	public ConstructorInJava() {
		System.out.println("Ankit");
	}
	public ConstructorInJava(int a) {
		this();
		System.out.println(a);
	}
	public static void main(String[] args) {
		//new ConstructorInJava();// non-parametrised constructor
	new ConstructorInJava(55);
	}

}
