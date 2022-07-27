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
public class Anglesoftriangle {
    public static void main(String args[])
{
    int a, b, c;
    Scanner op=new Scanner(System.in);
    /* Input two angles of the triangle */
    System.out.print("Enter First angles of triangle: ");
    a=op.nextInt();
    System.out.print("Enter Second angles of triangle: ");
    b=op.nextInt();;

    /* Compute third angle */
    c = 180 - (a + b);

    /* Print value of the third angle */
    System.out.println("Third angle of the triangle = "+c);
}
}
