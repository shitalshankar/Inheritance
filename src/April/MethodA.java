package April;

public class MethodA {
	public void evenOrOdd() {
		int a = 10;
		if(a%2==0) {
			System.out.println("Number is even "+ a);
		}
		else
		{
			System.out.println("Number is odd "+ a);
		}
	}
	public void evenOrOdd1(int a) {
		
		if(a%2==0) {
			System.out.println("Number is even "+ a);
		}
		else
		{
			System.out.println("Number is odd "+ a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodA obj = new MethodA();
obj.evenOrOdd();
obj.evenOrOdd1(5);
obj.evenOrOdd1(6);
	}

}
