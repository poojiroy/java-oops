package opps;

public class Point {

	private static void setX(int x) {
		System.out.println(x);
	
		
	}
	private static void setY(int y) {
		System.out.println(y);
		
	}
	private static void setXY(int x, int y) {
		int result = x+y;
		System.out.println(result);
		
	}
	public static void main(String[] args) {
	    int x=5;
		int y=6;
		setX(x);
		setY(y);
		setXY(x, y);
	}
	

}
