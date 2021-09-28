/*
 *  UCF COP3330 Fall 2021 Assignment 25 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex25;

import java.util.Scanner;

public class ex25
{

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a password for checking:");
        String s1 = x.nextLine();
        String s2 = null;
        if (passwordValidator(s1) == 0)
        {
            s2 = "very weak password";
        }else if(passwordValidator(s1) == 1)
        {
            s2 = "weak password";
        }else if(passwordValidator(s1) == 2)
        {
            s2 = "strong password";
        }else if(passwordValidator(s1) == 3)
        {
            s2 = "very strong password";
        }

        System.out.println("The password "+s1+" is a "+s2);


        System.exit(0);
    }

    public static int passwordValidator(String s1)
    {
        int strength = 0;
        int num = 0;
        int let = 0;
        int spe = 0;

        int l = 0;
        char[] a1 = s1.toCharArray();

        while(l<s1.length())
        {
            if (Character.isDigit(a1[l]))
            {
                num++;
            }else if(Character.isLetter(a1[l]))
            {
                let++;
            }else
            {
                spe++;
            }
            l++;
        }

        if(s1.length()<8 && num!=0 && let==0 && spe==0)
        {
            strength=0;
            return strength;
        }else if(s1.length()<8 && let!=0 && num==0 && spe==0)
        {
            strength=1;
            return strength;
        }else if(s1.length()>=8 && num!=0 && let!=0 && spe==0)
        {
            strength=2;
            return strength;
        }else if(s1.length()>=8 && num!=0 && let!=0 && spe!=1)
        {
            strength=3;
            return strength;
        }

        return strength;
    }
}