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
public class MinutesSeconds {
static void ConvertHours(int n)
{
int minutes, seconds;

	minutes = n * 60;
	seconds = n * 3600;

	System.out.println( "Minutes = " + minutes
		+ ", Seconds = " + seconds);
}

	public static void main (String[] args) {
	int n = 5;
	ConvertHours(n);
	}
	
}



