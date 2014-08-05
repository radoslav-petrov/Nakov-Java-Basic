package _2_javaSyntax_4;
import java.util.Scanner;

public class SmalletNumber {
	public static void main(String[] args) {
		
		double a = 0, b = 0, c = 0, smallest;
		Scanner input = new Scanner(System.in);
		
		if(input.hasNextDouble()) {
			a = input.nextDouble();
		} else {
			System.out.println("wrong input");
		}
		if(input.hasNextDouble()) {
			b = input.nextDouble();
		} else {
			System.out.println("wrong input");
		}
		if(input.hasNextDouble()) {
			c = input.nextDouble();
		} else {
			System.out.println("wrong input");
		}
		
		smallest = compare(a, b, c);
		
		System.out.println(smallest);
		
		input.close();
	}
	
	public static double compare(double a, double b, double c) {
		
		double min;
		min = a;
		if(min > b) min = b;
		if(min > c) min = c;
		return min;
	}

}
