package _2_JavaSyntax_8;
import java.util.Scanner;

public class CountEqualBitParts {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		
		if(input.hasNextInt()) {
			n = input.nextInt();
			equalBitCounter(n);
		}
		
	}
	
	public static void equalBitCounter(int n) {
		int count = 0;
		String bin;
		String[] srchString = new String[2];
		srchString[0] = "00";
		srchString[1] = "11";
		
		bin = Integer.toBinaryString(n);
		
		for(int j = 0; j < 2; j++) {
			int tmp = -1;
			for(int i = 0; i < (bin.length()-1); i++) {
				int newI = bin.indexOf(srchString[j], i);
				if(tmp == newI) {
					continue;
				} else if(newI != -1) {
					tmp = newI;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

	
}
