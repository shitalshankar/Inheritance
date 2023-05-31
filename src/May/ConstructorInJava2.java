package May;

public class ConstructorInJava2 {
	public ConstructorInJava2(boolean a) {
		System.out.println("Shital");
	}
	public ConstructorInJava2(int a){
		this(true);
		System.out.println(a);
	}
	public static void main(String[] args) {
		new ConstructorInJava2(55);
	}

}
