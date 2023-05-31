package April;

public class ParametrizedTriangle {
	public void triangle(int i)
	{
		for(int a=1; a<=i; a++)
		{
			for(int j=1; j<=a; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void reverseTriangle() {
		// TODO Auto-generated method stub
		for(int a=1; a<=4; a++)
		{
			for(int j=4; j>=a; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
public static void main(String[] args) {
	ParametrizedTriangle obj = new ParametrizedTriangle();
	obj.triangle(5);
	obj.triangle(10);
	obj.triangle(15);
	
}
}
