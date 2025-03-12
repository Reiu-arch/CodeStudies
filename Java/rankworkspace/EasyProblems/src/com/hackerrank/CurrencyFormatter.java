package com.hackerrank;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        double munny = sc.nextDouble();
        
        NumberFormat US = NumberFormat.getCurrencyInstance();
        
        US.setCurrency(Currency.getInstance(Locale.US));
        DecimalFormat dfIndia = new DecimalFormat("#,###.00");
        
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        
        
        System.out.println("US: "+US.format(munny));
        System.out.println("India: Rs."+ dfIndia.format(munny));
        System.out.println("China: "+ china.format(munny));
        System.out.println("France: "+france.format(munny));
        
        sc.close();
    }
}
