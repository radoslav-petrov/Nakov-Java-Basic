package _1_introduction_8;
import java.util.Scanner;
import java.util.Arrays;

public class SortStrings {

	public static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args){
		
		int n = 0;
		
		do{
			System.out.print("Enter number of strings: ");
			if(userInput.hasNextInt()){
				n = userInput.nextInt();
			} else {
				userInput.nextLine();
			}
		} while(n <= 0);
		userInput.nextLine();
		
		String[] stringsToSort = new String[n];
		
		for(int i = 0; i < n; i++){
			stringsToSort[i] = userInput.nextLine();
		}
		//System.out.println(Arrays.toString(stringsToSort));

		Arrays.sort(stringsToSort);
		//System.out.println(Arrays.toString(stringsToSort));
		System.out.println();
		for(String item : stringsToSort){
			System.out.println(item);
		}
		
		
	}
	
}
