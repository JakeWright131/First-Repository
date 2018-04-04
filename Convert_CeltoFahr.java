/**
Name: Convert_CeltoFahr

Description: Converts celsius to fahrenheit

Created by: Jake Wright

Created on:  29/03/2018

*/

import java.util.Scanner;

public class Convert_CeltoFahr{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double Celsius;
	double Fahrenheit;

	System.out.print("Enter temperature: ");
	Celsius = input.nextDouble();

	Fahrenheit = 9.0/5.0 * (Celsius + 32);

	System.out.println();
	System.out.printf("%.0f Celsius is %.0f Fahrenheit%n%n", Celsius, Fahrenheit);
	System.out.println();



	}
}

