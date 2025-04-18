package lec4oopAndClasses;

public class Baby {
	static int numBabiesMade = 0;
	public static void main(String[] args) {
		Baby.numBabiesMade = 100;
		Baby b1 = new Baby();
		Baby b2 = new Baby();
		System.out.println(b1.numBabiesMade);
		System.out.println(b2.numBabiesMade);
		Baby.numBabiesMade = 2;
		System.out.println(b1.numBabiesMade);
		System.out.println(b2.numBabiesMade);
	}
}


