/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;  
public class Convert {
     public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the length in centimeter::\n");

        float c = in.nextFloat();
        float m;
        float k;

        // c = centimeter
	    // m = meter
	    // k = kilometer

        /* Convert centimeter into meter and kilometer */
	    m = (float)(c / 100);
	    k = (float)(c / 100000);
            // Output
        System.out.print("\n");
        System.out.println("Length in Meter      = " + m + " meter");
        System.out.println("Length in Kilometer  = " + k + " kilometer");
    }
}

