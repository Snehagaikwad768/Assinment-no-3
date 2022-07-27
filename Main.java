/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String args[])
   {
        //value of kelvin declared
        double kelvin = 80.33;
        //value of fahrenheit declared  
        double fahrenheit = 80.33;
        
        //converting fahrenheit to kelvin
        double k = (((fahrenheit - 32) * 5 / 9) + 273.15); 
        //converting kelvin to fahrenheit 
        double f = ((((kelvin - 273.15) * 9) / 5) + 32);
        //printing result
        System.out.println("Value of "+kelvin+" kelvin in fahrenheit: "+ f);   
        System.out.println("Value of "+fahrenheit+" fahrenheit in kelvin: "+ k);   
   }
}

