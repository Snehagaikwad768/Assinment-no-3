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
import java.util.Scanner;  
  
public class Javatpoint {
    public static void main (String[] args) {  
    System.out.println("Enter the value of num1 and num2");  
    Scanner sc = new Scanner(System.in);  
    int num1 = sc.nextInt();  
    int num2 = sc.nextInt();  
    int quotient = 0, remainder = 0;  
  
      
    quotient = num1 / num2;  
  
    remainder = num1 % num2;  
  
    System.out.println("Quotient when " + num1 + "/" + num2 + " is: "
    + quotient);  
    System.out.println("Remainder when " + num1 + " is divided by "   
  
+ num2 + " is: " + remainder);  
    }  
}   

