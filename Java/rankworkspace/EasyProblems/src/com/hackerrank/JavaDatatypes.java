package com.hackerrank;

import java.util.Scanner;

public class JavaDatatypes {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int numberOfQueries = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < numberOfQueries; i++){
        String numberCheck = sc.nextLine();
        try {
            long longNumber = Long.parseLong(numberCheck);

            System.out.println(longNumber+" can be fitted in:");
            if(longNumber >= Byte.MIN_VALUE && longNumber <= Byte.MAX_VALUE){
                System.out.println("* byte");
            }
            
            if(longNumber >= Short.MIN_VALUE && longNumber <= Short.MAX_VALUE){
                System.out.println("* short");
            }
            
            if(longNumber >= Integer.MIN_VALUE && longNumber <= Integer.MAX_VALUE){
                System.out.println("* int");
                
            }
       
            System.out.println("* long");
        }
        //----------------------------------------------------------------\\
        catch(NumberFormatException e){
           System.out.println(numberCheck+" can't be fitted anywhere."); 
        }
    
    }
    sc.close();
    }

}
