/*
 *  UCF COP3330 Fall 2021 Assignment 26 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex26;
import java.lang.*;
import java.util.*;



public class ex26
{
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b=x.nextDouble();
        b=b*1000;
        b=Math.ceil(b);
        b=b/1000;
        System.out.print("What is the APR on the card (as a percent)? ");
        double i=x.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double p=x.nextDouble();
        p=p*1000;
        p=Math.ceil(p);
        p=p/1000;

        double months = PaymentCalculator.calculateMonthsUntilPaidOff(b,i,p);

        System.out.println("It will take you "+months+" months to pay off this card.");

        System.exit(0);
    }

}
