/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.*;
public class Celsius_to_Kelvin {
    // Java program to convert temperature
// from degree Celsius to kelvin



	// function to convert temperature
	// from degree Celsius to Kelvin
	static float Celsius_to_Kelvin(float C)
	{
		return (float)(C + 273.15);
	}
	
	// Driver function
	public static void main (String[] args)
	{
		// variable to hold the
		// temperature in Celsius
		float C = 26;
	
		System .out.println ( "Temperature in Kelvin ( K ) = "
							+ Celsius_to_Kelvin(C));
			
	}
}

// This code is contributed by vt_m.


