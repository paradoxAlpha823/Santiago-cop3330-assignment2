/*
 *  UCF COP3330 Fall 2021 Assignment 35 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex35;
import java.util.Random;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class ex35 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner x = new Scanner(System.in);
        String entry="";
        ArrayList<String>n=new ArrayList();
        do
        {
            System.out.println("Enter a name:");
            entry=x.nextLine();
            if(!entry.isBlank() && !entry.isEmpty())
            {
                n.add(entry);
            }
        }while(!entry.isBlank()&&!entry.isEmpty());
        int r= (int)(random.nextInt(n.size()));
        System.out.println("The winner is... "+n.get(r));

        System.exit(0);
    }
}
