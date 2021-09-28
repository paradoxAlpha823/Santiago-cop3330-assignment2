/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Diego Santiago
 */


package ex32;
import java.util.Scanner;
import java.lang.*;

import static java.lang.Integer.*;

public class ex32 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        System.out.println("Let's play Guess the Number!");
        int in = 0,tot,dif,n;


        boolean l=true;

        while(l=true)
        {
            tot=0;
            System.out.print("Enter the difficulty level(1, 2, or  3): ");
            dif=x.nextInt();
            if(dif==1){
                n=(int)(Math.random()*11+1);
            }else if(dif==2){
                n=(int)(Math.random()*101+1);
            }else{
                n=(int)(Math.random()*1001+1);
            }
            System.out.print("I have my number. What's your guess?: ");
            while(in!=n)
            {
                tot++;
                String s1=x.next();
                try {
                    in = Integer.parseInt(s1);
                    if(in==n){
                        System.out.println("You got it in "+tot+" guesses!");
                    }else if(in<n){
                        System.out.println("Too low, try again.");
                    }else if(in>n){
                        System.out.println("Too high, try again.");
                    }
                }catch(NumberFormatException e){
                    System.out.println("Enter only integers please.");
                }
            }

            System.out.println("\nDo you wish to play again(Y/N)?");
            char choice=x.next().charAt(0);
            choice=Character.toUpperCase(choice);
            if(choice=='Y')
            {
                l=true;
            }else
            {
                l=false;
                break;
            }

        }

        System.exit(0);
    }

}

