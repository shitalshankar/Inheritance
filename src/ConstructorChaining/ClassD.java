package ConstructorChaining;

public class ClassD extends ClassC {
	public ClassD(String e) {
		super(55);
		System.out.println("ClassD ka counstructor");
	}
public static void main(String[] args) {
	new ClassD("Shital");
}
}
