package lec1intro;

class domath {
	public static void main(String[] args) {
		int num_apples = 8;
		double len_bamboo = 11.5;
		System.out.println(num_apples);
		System.out.println(len_bamboo);
		num_apples = num_apples / 3;
		len_bamboo = len_bamboo / 5;
		System.out.println(num_apples);
		System.out.println(len_bamboo);
		int total_int;
		double total_double;
		//total_int = num_apples+len_bamboo;
		total_double = num_apples+len_bamboo;
		//System.out.println(total_int);
		System.out.println(total_double);
	}
}
