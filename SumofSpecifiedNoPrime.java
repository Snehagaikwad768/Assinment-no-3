/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.*;
public class SumofSpecifiedNoPrime {
    public static void main(String[] args) throws java.io.IOException{
            Scanner scan = new Scanner(System.in);
                int count=0;
                int sum=0;
	System.out.println("Input a number (n<=10000) to compute the sum:");
	int n=scan.nextInt();
                for(int i=2;;i++){
                    if(prime(i)){
                        count++;
                        sum+=i;
	 if(count==n)break;
         }
	         } 
	System.out.println("Sum of first "+n+" prime numbers:"); 
                System.out.println(sum);
	}				
         public static boolean prime (int n){
                if(n==1)return false;
                for(int i=2;i<=Math.sqrt(n);i++)
                    if(n%i==0)return false;
                return true;
            }
}

