/*
 *  UCF COP3330 Fall 2021 Assignment 29 Solution
 *  Copyright 2021 Diego Santiago
 */


package ex29;
import java.util.Scanner;

public class ex29 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        boolean l=true;
        String s1="";
        int num1=0;
        while(l=true)
        {
            System.out.print("What is rate of return? ");
            s1=x.nextLine();
            try {
                num1 = Integer.valueOf(s1);
                System.out.println("It will take  "+(72/num1)+" years to double your initial investment.");
                l=false;
            } catch (NumberFormatException exception) {
                System.out.print("Sorry, that's not a valid input.\n");
            } catch (ArithmeticException exception){
                System.out.print("Sorry, that's not a valid input.\n");
            }
            if(!l){
                break;
            }
        }

        System.exit(0);
    }

}
