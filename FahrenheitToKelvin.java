/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class FahrenheitToKelvin {
    // Java program to convert temperature
// from Fahrenheit to Kelvin



// Function to convert temperature
// from degree Fahrenheit to Kelvin
static float Fahrenheit_to_Kelvin( float F )
{
	return 273.5f + ((F - 32.0f) * (5.0f/9.0f));
}

// Driver code
public static void main(String arg[])
{
	float F = 100;
	System.out.print("Temperature in Kelvin ( K ) = "
					+ (Math.round(Fahrenheit_to_Kelvin( F )
										*1000.0)/1000.0)) ;
}
}
// This code is contributed by Anant Agarwal.


