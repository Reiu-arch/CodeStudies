package com.hackerrank;

import java.util.Scanner;

public class JavaLoops2 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        //this number will tell us how many times this entire block will loop 
        
        for(int i = 0; i < q; i++){
        	//this loops to the amount of times the query number states
             int a = sc.nextInt();
             int b = sc.nextInt();
             int n = sc.nextInt();
             //These will in-take the values needed for the series
             
             for(int p = 0; p < n; p++){
            	 //the 'n' value determines how many times the b series will re-iterated
                a= a + b;
                /*there is a 2 pow 0 which is just 1. This is a trick in the equation, simply put 
                what the equation is actually doing is just a simple a + b. 
                
                This is where i got stuck on trying to decipher what the equation really meant 
                until i plugged it into a calculator and took a second look at the examples
                */
                System.out.print(a + " ");
                //notice how each number is printed on the same line
                b = b * 2;
                //In the examples is shows how after each series the sum of a (just a  constant) is merely being added upon by the b value times two, the amount of times this occurs being dictated by the n value. 
             }
             System.out.println("");
             //each iteration of the query is separated onto its own line
        }
        
        sc.close();
    }

}
