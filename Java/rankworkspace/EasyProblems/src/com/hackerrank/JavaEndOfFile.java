package com.hackerrank;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    
    //need to implement a form of tracker. How do I count how many times this iterates? for Loop?
    int i = 1;
    //dec needs to be out of the loop so it doesnt turn back to one once looped
    while(sc.hasNext()){
        String line = sc.nextLine();
        System.out.println(i++ +" "+line);    }
    
    sc.close();
    }
    
}
