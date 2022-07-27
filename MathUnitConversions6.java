/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class MathUnitConversions6 {
    public static void main(String[] args) {

		double kilometers;

		System.out.println("Please enter kilometers:");

		Scanner in = new Scanner(System.in);
		kilometers = in.nextDouble();

		double miles = kilometers / 1.6;

		System.out.println(miles + " Miles");

	}
}

