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
public class SumOfDigitsExample1 {
    {  
public static void main (String args[])  
{  
int number, digit, sum = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
number = sc.nextInt();  
while(number > 0)  
{  
//finds the last digit of the given number    
digit = number % 10;  
//adds last digit to the variable sum  
sum = sum + digit;  
//removes the last digit from the number  
number = number / 10;  
}  
//prints the result  
System.out.println("Sum of Digits: "+sum);  
}  
}  
}

