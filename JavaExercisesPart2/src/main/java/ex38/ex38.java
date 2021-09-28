/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex38;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class ex38 {

    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String s1 = x.nextLine();

        String a1[] = s1.split(" ");
        Integer evens[]=filterEvenNumbers(a1);

        if(evens.length==0){
            System.out.print("There are no even numbers.");
            System.exit(0);
        }

        System.out.print("The even numbers are ");
        int i=0;
        while(i<evens.length)
        {
            System.out.print(evens[i]+" ");
            i++;
        }

        System.exit(0);
    }

    public static Integer[] filterEvenNumbers(String a1[])
    {
        ArrayList<Integer> evens=new ArrayList();
        int i=0;
        int n;
        while(i<a1.length)
        {
            n=Integer.parseInt(a1[i]);
            if(n%2==0)
            {
                evens.add(n);
            }
            i++;
        }
        Integer even[]=new Integer[evens.size()];
        even=evens.toArray(even);
        return even;
    }
}
