package lec2more;

class FooCoporationWagePay {
	public static void wagePay(double basePay, double workTime) {
		double minBasePay = 8.0;
		double overtimeThreshold = 40;
		double overtimePayCoeff = 1.5;
		double maxWorkTime = 60;
		double finalPay;

		if (basePay < minBasePay) {
			System.out.println("Basepay cannot be lower than minBasePay!");

		} else if (workTime < 0) {
			System.out.println("workTime cannot be less than 0!");

		} else if (workTime > maxWorkTime) {
			System.out.println("workTime cannot be over maxWorkTime! Overwork abuse is not acceptable.");

		} else if (workTime >= 0 && workTime <= overtimeThreshold) {
			finalPay = basePay * workTime;
			System.out.println("finalPay=" + finalPay);

		} else if (workTime > overtimeThreshold && workTime <= maxWorkTime) {
			finalPay = basePay * (overtimeThreshold + (workTime - overtimeThreshold) * overtimePayCoeff);
			System.out.println("finalPay=" + finalPay);

		}
	}

	public static void main(String[] args) {
		wagePay(7.5, 20);
		wagePay(8, 25);
		wagePay(9.5, 52.5);
		wagePay(8, 62);
		wagePay(9, -8);
	}
}
