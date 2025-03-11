package com.hackerrank;

import java.util.Scanner;

public class StaticInitializerBlock {

	static int calculateArea(int i, int p) throws Exception {
		if (i <= 0 || p <= 0) {
			//checks to see if inputs are less than or equal to zero
			throw new Exception("java.lang.Exception: Breadth and height must be positive");
			//created custom exception thrown
		} else {
			return i * p;
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		int p = sc.nextInt();
		//Receive inputs and saved into variables

		try {
			int g = calculateArea(i, p);
			
			System.out.println(g);

		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//A try/catch block is needed to handle the thrown exception of the initializer block
		//this is needed because the initializer explicitly uses the "throws Exception" 

		sc.close();
	}

}
