package _2_javaSyntax_5;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int decimal = 0;
		
		System.out.println("Enter positive decimal number");

		if(input.hasNextInt()) {
			decimal = input.nextInt();
		} else {
			System.out.println("Wrong input");
		}
		if(decimal < 0) System.out.println("Wrong input");
		
		System.out.println(Integer.toHexString(decimal).toUpperCase());
		
		input.close();
	}
	
}