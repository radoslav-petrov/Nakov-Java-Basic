package _2_JavaSyntax_7;
import java.util.Arrays;
import java.util.Scanner;

public class CountOfBitsOne {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0;
		int count;
		
		if(input.hasNextInt()) {
			n = input.nextInt();
		}
		
		count = binCounter(n);
		System.out.println(count);
		input.close();
		
	}
	
	public static int binCounter(int n) {
		String bin;
		String[] bits = new String[100];
		int count = 0;
		
		bin = Integer.toBinaryString(n);
		//System.out.println(bin);
		
		bits = bin.split("");
		
		for(String bit : bits) {
			try { 
				count = count + Integer.parseInt(bit);
			}
			catch(NumberFormatException e) {
				continue;
			}
		}
		return count;
	}

}
