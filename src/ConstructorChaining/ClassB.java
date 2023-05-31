package ConstructorChaining;

public class ClassB extends ClassA{
	public ClassB() {
		System.out.println("ClassB ka counstructor");
	}
	public static void main(String[] args) {
		new ClassB();
		
	}

}
