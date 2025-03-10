package com.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {
	
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        int p = sc.nextInt();
        
        
        if(i> 0 && p > 0){
            System.out.println(i * p);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        
        sc.close();
    }

}
