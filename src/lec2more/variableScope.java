package lec2more;

class variableScope {
	public static void squareChange(int x) {
		System.out.println("method x=" + x);
		x *= x;
		System.out.println("method x=" + x);
	}
	
	public static void main(String[] args) {
		int x = 2;
		System.out.println("main x=" + x);
		squareChange(x);
		System.out.println("main x=" + x);
	}
}
