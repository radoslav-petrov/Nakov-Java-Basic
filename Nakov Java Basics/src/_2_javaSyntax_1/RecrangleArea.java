package _2_javaSyntax_1;
import java.util.Scanner;

public class RecrangleArea {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int a = 0, b = 0, s;
		
		System.out.println("Please enter one side of the rectangle");
		if(userInput.hasNextInt()) {
			a = userInput.nextInt();
		} else {
			System.out.println("Wrong input");
		}
		System.out.println("Please enter the other side of the rectangle");
		if(userInput.hasNextInt()) {
			b = userInput.nextInt();
		} else {
			System.out.println("Wrong input");
		}
		
		s = calculateArea(a, b);
		System.out.println("The area of the rectangle is: " + s);
		
	}
	
	public static int calculateArea(int a, int b) {
		return a * b;
	}

}
