/*
 *  UCF COP3330 Fall 2021 Assignment 33 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex33;
import java.util.Scanner;
import java.lang.*;

public class ex33 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("What's your question?");
        String useless = x.nextLine();
        int rng = (int)(Math.random()*5+1);
        switch(rng)
        {
            case 1:System.out.println("Yes");
                   break;
            case 2:System.out.println("No");
                break;
            case 3:System.out.println("Maybe");
                break;
            case 4:System.out.println("Ask again later.");
                break;
        }
        System.exit(0);
        }
    }

