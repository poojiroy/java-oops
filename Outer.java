package opps;

public class Outer {
	static void display(double c, double d) {
		double result = c+d;
		System.out.println(result);
	}
	public class Inner{
		
		static void display(int a, int b) {
			int result = a+b;
			System.out.println(result);
		}
	}
	public static void main(String[] args) {
		int a=4;
		int b=7;
		double c=4;
		double d=6;
		display(a,b);
		display(c,d);
	}

}
