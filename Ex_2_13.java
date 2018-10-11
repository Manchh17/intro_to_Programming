/*
Author: Philip Manchester
Date: 10/11/18
*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the monthly saving amount: ");
		double ini = input.nextDouble();
		double accum = 0;
		accum = (ini + accum) * 1.00417;
		accum = (ini + accum) * 1.00417;
		accum = (ini + accum) * 1.00417;
		accum = (ini + accum) * 1.00417;
		accum = (ini + accum) * 1.00417;
		accum = (ini + accum) * 1.00417;
		
		System.out.print("After month 6, the account value would be " + accum);
		
	}
}