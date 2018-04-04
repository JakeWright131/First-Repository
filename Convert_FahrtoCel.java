/**
Name: Convert_FahrtoCel

Description: Converts fahrenheit to Celsius

Created by: Jake Wright

Created on:  29/03/2018

*/

import java.util.Scanner;

public class Convert_FahrtoCel{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double Celsius;
	double Fahrenheit;

	System.out.print("Enter temperature: ");
	Fahrenheit = input.nextDouble();

	Celsius = 5.0/9.0 * (Fahrenheit - 32);

	System.out.println();
	System.out.printf("%.0f Fahrenheit is %.0f Celsius%n%n", Fahrenheit, Celsius);
	System.out.println();



	}
}

