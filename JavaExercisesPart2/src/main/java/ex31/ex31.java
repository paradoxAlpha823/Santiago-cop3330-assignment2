/*
 *  UCF COP3330 Fall 2021 Assignment 31 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex31;
import java.util.Scanner;

public class ex31 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        String s1,s2;
        int hr = 0,age=0;
        boolean l;
        double i=55;
        while(l=true)
        {
            s1=x.nextLine();
            try {
                hr = Integer.valueOf(s1);
                l=false;
            } catch (NumberFormatException exception) {
                System.out.print("Sorry, that's not a valid input.\n");
            }
            if(!l){
                break;
            }
        }
        while(l=true)
        {

            s2=x.nextLine();
            try {
                age = Integer.valueOf(s2);
                l=false;
            } catch (NumberFormatException exception) {
                System.out.print("Sorry, that's not a valid input.\n");
            }
            if(!l){
                break;
            }
        }
        System.out.println("Resting Pulse: " + hr + "\tAge: " + age);

        System.out.println("Intensity | Rate ");
        System.out.println("------------------------");

        while(i<96)
        {
            int bpm= (int) ((((220-age)-hr)*(i/100))+hr);
            System.out.println((int)i+"% \t  | "+bpm+"bpm");
            i+=5;
        }

        System.exit(0);
    }

}
