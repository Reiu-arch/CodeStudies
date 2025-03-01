package com.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIfElse {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        int p = N;
        
        if(p % 2 == 1){
            System.out.println("Weird");
        }
        if(p % 2 == 0){
            if(2 <= N && N <= 5){
                System.out.println("Not Weird");
            }
            if(6 <= N && N <= 20){
                System.out.println("Weird");
            }
            if(N>20){
                System.out.println("Not Weird");
            }
        }

        bufferedReader.close();
    }
	/* Task
Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of 2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20, print Weird
If  is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/
}
