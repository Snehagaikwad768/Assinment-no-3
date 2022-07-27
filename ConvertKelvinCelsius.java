/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ConvertKelvinCelsius {
    public static void main(String[] args) throws NumberFormatException, IOException {
		// Declare the reader from console
		BufferedReader br;
		// Get the console input for the temperature in Kelvin
		System.out.println("Temperature in Kelvin:");		
		br = new BufferedReader(new InputStreamReader(System.in));
		// assign to float variable the temperature in Kelvin
		float kelvin = Float.parseFloat(br.readLine());
		// Kelvin to Degree Celsius Conversion
		float celsius = kelvin - 273.15F;
		System.out.println("Celsius: "+ celsius);

	}

}

