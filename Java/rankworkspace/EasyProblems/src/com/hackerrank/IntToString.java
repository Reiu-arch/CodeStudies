package com.hackerrank;

import java.util.Scanner;

public class IntToString {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    
    if(n >= -100 && n <= 100){
        System.out.println("Good job");
    }
    else{
        System.out.println("Wrong answer");
    }
    }	

}
