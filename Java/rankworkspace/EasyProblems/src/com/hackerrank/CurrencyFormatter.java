package com.hackerrank;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        double munny = sc.nextDouble();
        
        NumberFormat nF = NumberFormat.getCurrencyInstance();
        
        nF.setCurrency(Currency.getInstance(Locale.US));
        System.out.println("US: "+nF.format(munny));
        
        DecimalFormat df = new DecimalFormat("#,###.00");
        String india = df.format(munny);
        System.out.println("India: Rs."+ india);
        
//        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        System.out.println("China: "+china.format(munny));
        
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.CHINA);
        symbols.setCurrencySymbol("\uFFE5");
        
        DecimalFormat chinaFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(Locale.CHINA);
        chinaFormat.setDecimalFormatSymbols(symbols);
        System.out.println("China: "+chinaFormat.format(munny));
        
        //HackerRank wants the full width Yuan symbol but java.format puts in the Yen symbol. Had to manually change it to Yuan
        
        // nF.setCurrency(Currency.getInstance(Locale.FRANCE));
        // System.out.println("France: "+nF.format(munny));
        
        //this formatting incorrectly formats the input number
        
        
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//        System.out.println("France: "+france.format(munny));
        
        //not formatting correctly??
        
        DecimalFormat franceFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(Locale.FRANCE);
        DecimalFormatSymbols franceSymbols = new DecimalFormatSymbols(Locale.FRANCE);
        franceSymbols.setGroupingSeparator('\u202F');
        franceFormat.setDecimalFormatSymbols(franceSymbols);
        System.out.println("France: " + franceFormat.format(munny));
        
        //still not fomatting correctly???
        
        sc.close();
    }

}
