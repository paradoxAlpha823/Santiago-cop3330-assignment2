/*
 *  UCF COP3330 Fall 2021 Assignment 36 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex36;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;

public class ex36 {

    public static double average(ArrayList n)
    {
        int l=0;
        int tot=0;
        double ave=0;
        while(l<n.size())
        {
            tot +=(int)(n.get(l));
            l++;
        }
        ave=tot/n.size();
        return ave;
    }
    public static double max(ArrayList n)
    {
        int l=0;
        int max=0;
        while(l<n.size())
        {
            if(max<(int)n.get(l))
            {
                max=(int)n.get(l);
            }
            l++;
        }
        return max;
    }
    public static double min(ArrayList n)
    {
        int l=0;
        int min=(int)n.get(0);
        while(l<n.size())
        {
            if(min>(int)n.get(l))
            {
                min=(int)n.get(l);
            }
            l++;
        }
        return min;
    }
    public static double std(ArrayList n, double a)
    {
        double an= average(n);
        int l=0;
        double std;
        int c;
        int tot=0;
        while(l<n.size())
        {
            c= (int) ((int) n.get(l)-an);
            tot+=Math.pow(c,2);
            l++;
        }
        std=tot/n.size();
        std= Math.sqrt(std);
        std=std*100;
        std=Math.round(std);
        std=std/100;
        return std;
    }
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        int entry=0;
        int l=1;
        String s1=null;
        ArrayList<Integer>n=new ArrayList();
        do
        {
            System.out.print("Enter a number: ");
            s1=x.next();
            try {
                entry = Integer.parseInt(s1);
                n.add(entry);
            }catch(NumberFormatException e){
                s1=s1.toLowerCase();
                if(s1.equals("done"))
                {
                    l=0;
                    break;
                }else
                {
                    System.out.println("Please enter only integers");
                }
            }
        }while(l!=0);
        System.out.println("Numbers:"+n);
        double a= average(n);
        double ma=max(n);
        double mi=min(n);
        double st=std(n,a);
        System.out.println("The average is: "+a);
        System.out.println("The minimum is: "+mi);
        System.out.println("The maximum is: "+ma);
        System.out.println("The standard deviation is: "+st);

        System.exit(0);
    }
}
