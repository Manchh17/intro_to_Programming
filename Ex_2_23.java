/*
Author: Philip Manchester
Date:10/11/18
*/
import java.untl.Scanner;
class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(" Enter the driving distance ");
		double distance =  input.nextDouble();
		System.out.print(" Enter miles per gallon ");
		double fuelEf = input.nextDouble();
		System.out.print("Enter the price per gallon ");
		double pricePerGallon = input.nextDouble();
		double cost = distance / 25.5 * pricePerGallon;
		System.out.print(" The cost of driving is $" + cost);
		
	}
}