package com.hackerrank;

import java.util.Scanner;

public class StdInAndStdOut1 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scanner = new Scanner(System.in);
int firstNum = scanner.nextInt();
scanner.nextLine();
int secondNum = scanner.nextInt();
scanner.nextLine();
int thirdInt = scanner.nextInt();
scanner.close();

System.out.println(firstNum);
System.out.println(secondNum);
System.out.println(thirdInt);
    }
	/* Task
In this challenge, you must read  integers from stdin and then print them to stdout.
 Each integer must be printed on a new line. To make the problem a little easier, 
 a portion of the code is provided for you in the editor below.

*/

}
