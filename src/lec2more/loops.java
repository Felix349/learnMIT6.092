package lec2more;

class loops {
	public static void main(String[] args) {
		for(int i = 0;i<3;i++){
			for (int j = 2; j < 4; j++) {
				System.out.println ("" + i + j);
			}
		}
		System.out.println(args.length);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
	}
}
