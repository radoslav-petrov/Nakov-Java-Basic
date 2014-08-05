package _3_JavaLoops_1;

public class SymmetricNumbers {
	public final int RANGEMIN = 0;
	public final int RANGEMAX = 999;
	
	
	public static void main(String[] args) {
		int start = 4, end = 567;
		
		generateNumbers(start, end);
	}
	
	public static void generateNumbers(int start, int end) {
		
		String num;
		int numLength;
		for(int i = start; i <= end; i++) {
			num = Integer.toString(i);
			numLength = num.length();
			if(numLength == 1) {
				System.out.print(num + " ");
			} else if(numLength > 1) {
				if(num.charAt(0) == num.charAt(numLength-1)) {
					System.out.print(num + " ");
				}
			}
			
		}
	}
	
}
