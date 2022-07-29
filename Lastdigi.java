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
public class Lastdigi {
     public static void main(String[] args)
    {
        // create scanner class object
        Scanner sc = new Scanner(System.in);
        // prompt user to enter a number
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int swappedNum = swapDigits(n);
        System.out.println("The Number after Swapping First Digit and Last Digit = " + swappedNum);
    }
    private static int swapDigits(int n)
    {
        int lastDigit = n % 10;
        // Find total number of digits - 1
        int digitsCount = (int) Math.log10(n);
        // Find first digit
        int firstDigit = (int) (n / Math.pow(10, digitsCount));
        // swap the first and last digits
        int swappedNum = lastDigit;
        swappedNum *= (int) Math.pow(10, digitsCount);
        swappedNum += n % ((int) Math.pow(10, digitsCount));
        swappedNum -= lastDigit;
        swappedNum += firstDigit;
        return swappedNum;
    }
}
    

