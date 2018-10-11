/*
Author: Philip Manchester
Date: 10/11/18
*/
import java.util.Scanner;

class Untiled{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.print("Input degree celsius: ");
		double celsius = input.nextDouble();
		double fahrenhiet = (9.8/5) * celsius + 32;
		System.out.println(celsius + " degree celsius is equal to" + fahrenhiet + " in fahrenhiet");
	}
}