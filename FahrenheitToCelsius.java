/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nickcipriani
 */

import java.util.Scanner;

public class FahrenheitToCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// Constant used to maintain consistency as message is used in multiple places within the code.
	final String REQUEST_INPUT_MESSAGE = "Please enter the temperature you'd like to convert in fahrenheit: ";
	
	System.out.println("This program converts fahrenheit temperatures to celsius.");
	
	System.out.print(REQUEST_INPUT_MESSAGE);
	
	Scanner keyIn = new Scanner(System.in);
	
	while (!keyIn.hasNextDouble()) {
	    System.out.printf("The input you entered was not acceptable. Please try again.%n%n");
	    System.out.print(REQUEST_INPUT_MESSAGE);
	    keyIn.nextLine();
	}
	
	double fahrenheitTemp = keyIn.nextDouble();
	
	// "d" after numbers because without it, they are treated as integers and always equal 0 without the decimal places.
	double celsiusTemp = (fahrenheitTemp - 32) * (5d / 9d);
	
	System.out.printf(fahrenheitTemp + "°F is equal to " + "%.2f" + "°C.%n", celsiusTemp);
    }
    
}
