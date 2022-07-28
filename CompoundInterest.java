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
public class CompoundInterest {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal (amount), time, and rate::\n");

        float p = in.nextFloat();
        float t = in.nextFloat();
        float r = in.nextFloat();
        float CI;
        // p = principal
        // t = time
        // r = rate
        // SI = compound interest

        // Calculate compound interest
        CI = (float)(p * (Math.pow((1 + r / 100), t)));

        // Output
        System.out.println("\nCompound Interest = " + CI);
    }
}
