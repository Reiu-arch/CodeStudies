package com.hackerrank;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        String numberCheck = sc.nextLine();
        
        try {
            long longNumber = Long.parseLong(numberCheck);

            System.out.println(longNumber+" can be fitted in:");
        
       
        }
        //----------------------------------------------------------------\\
        catch(NumberFormatException e){
           System.out.println(numberCheck+" can't be fitted anywhere."); 
        }
    sc.close();
    }
	

}
