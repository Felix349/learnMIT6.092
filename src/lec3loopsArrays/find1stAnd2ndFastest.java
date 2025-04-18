
package lec3loopsArrays;

class find1stAnd2ndFastest {
	public static int findFastest(int[] timeList) {// return the index of the fastest runner in a list
		int leastTime = Integer.MAX_VALUE;
		int index = -1;
		for (int i = 0; i < timeList.length; i++) {
			if (leastTime > timeList[i]) {
				leastTime = timeList[i];
				index = i;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		String[] nameList = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		int[] timeList = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		int fastest = findFastest(timeList);
		int secondFastest;
		// int[] timeListMod = timeList;
		// timeListMod[fastest] += 500;
		// secondFastest = findFastest(timeListMod);
		timeList[fastest] += timeList[timeList.length - fastest - 1];
		secondFastest = findFastest(timeList);
		timeList[fastest] -= timeList[timeList.length - fastest - 1];
		System.out.println("Fastest:" + nameList[fastest] + " " + "Time(Min):" + timeList[fastest]);
		System.out.println("SecondFastest:" + nameList[secondFastest] + " " + "Time(Min):" + timeList[secondFastest]);
	}
}
