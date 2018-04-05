/**
Name: Convert

Description: 	Implements an integer method named celsius that returns the Celsius equivalent of a
		Fahrenheit temperature, using the calculation:
		celsius = 5.0 / 9.0 * (fahrenheit - 32);
		Implements an integer method named fahrenheit that returns the Fahrenheit equivalent of
		a Celsius temperature, using the calculation:
		fahrenheit = 9.0 / 5.0 * celsius + 32;
		Uses the methods created in part a and b to write an application that enables the user either
		enter a Fahrenheit temperature and display the Celsius equivalent or to enter Celsius
		temperature and display the Fahrenheit equivalent.

Created by: Jake Wright

Created on:  04/04/2018

*/

import java.util.Scanner;

public class Convert{

	public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.println("1. Fahrenheit to Celsius");
	System.out.println("2. Celsius to Fahrenheit");
	System.out.println("3. Exit");

	System.out.print("Choice: ");
	int choice = input.nextInt();
	System.out.println();

	switch(choice){
	case 1:
	System.out.println("Fahrenheit to Celsius");
	System.out.println();
	Convert_FahrtoCel.main(null);
	break;

	case 2:
	System.out.println("Celsius to Fahrenheit");
	System.out.println();
	Convert_CeltoFahr.main(null);
	break;

	case 3:
	System.out.println("Exiting");
	break;

			}

	}
}
