package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 14 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the order amount?");
        String uiamount = sc.nextLine();
        float amount = Float.valueOf(uiamount);
        System.out.println("What is the state? ");
        String uistate = sc.nextLine();

        double tax = 0.55;
        float taxOutput = (float)tax;
        double subtotal = amount + tax;
        float subtotalOutput = (float)subtotal;

        String residentOutput = String.format("The subtotal is $%.2f.\nThe tax is $%.2f.\nThe total is $%.2f.", ((amount*100)+0.49)/100d, ((taxOutput*100)+0.49)/100d, ((subtotalOutput*100)+0.49)/100d);

        if(uistate.equals("WI"))
        {
            System.out.println(residentOutput);
            System.exit(1);
        }

        String nonresidentOutput = String.format("The total is $%.2f.", ((amount*100)+0.49)/100d);

        System.out.println(nonresidentOutput);









    }
}