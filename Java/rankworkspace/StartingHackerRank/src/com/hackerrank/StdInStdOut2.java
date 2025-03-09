package com.hackerrank;

import java.util.Scanner;

public class StdInStdOut2 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
	 
	int integerOne = sc.nextInt();
    sc.nextLine();
	double doubleOne = sc.nextDouble();
    sc.nextLine();
	String stringOne = sc.nextLine();
    
    System.out.println("String: "+stringOne);
    System.out.println("Double: "+doubleOne);
    System.out.println("Int: "+integerOne);
    sc.close();
    }
}

/* Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
*/
