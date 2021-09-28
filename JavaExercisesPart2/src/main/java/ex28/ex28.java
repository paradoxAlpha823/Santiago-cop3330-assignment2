/*
 *  UCF COP3330 Fall 2021 Assignment 28 Solution
 *  Copyright 2021 Diego Santiago
 */


package ex28;
import java.util.Scanner;

public class ex28 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int t=0;
        int l=5;
        while(l>0)
        {
            System.out.print("Enter an integer: ");
            int i1 = x.nextInt();
            t=t+i1;
            l--;
        }
        System.out.print("The total is: "+t);

        System.exit(0);
    }
}
