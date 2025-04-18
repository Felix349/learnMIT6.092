package lec7exceptionFileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckRow {
	public static void checkRowSum(String filename) throws IOException {
		int firstSum = -1;
		int buffer;

		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(filename + ":");
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println("line:" + line);
			buffer = 0;
			for (String part : line.split("\t")) {
				buffer += Integer.valueOf(part);
			}
			if (firstSum == -1) {// sum of 1st row is calculated
				firstSum = buffer;

			} else {
				if (firstSum != buffer) {// check if rowSum(sum of 1st row) is equal to buffer(sum of other rows)
					System.out.println("firstSum=" + firstSum + " " + "rowSum=" + buffer);
					System.out.println("This is not a magic square! Row sums are not equal.");
					br.close();
					return;
				}
			}

		}
		System.out.println("rowSum=" + firstSum);
		System.out.println("This is a magic square.");
		br.close();
	}

	public static void main(String[] args) throws IOException {
		String filename;
		InputStreamReader ir;
		BufferedReader br;

		System.out.println("Enter filename:(without suffix)");
		ir = new InputStreamReader(System.in);// input filename without suffix to check rowSum
		br = new BufferedReader(ir);
		filename = "./" + br.readLine() + ".txt";
		checkRowSum(filename);
	}
}
