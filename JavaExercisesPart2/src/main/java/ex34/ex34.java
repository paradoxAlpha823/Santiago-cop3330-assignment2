/*
 *  UCF COP3330 Fall 2021 Assignment 34 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex34;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class ex34 {
    boolean remover(ArrayList n, String del)
    {
        return n.remove(del);
    }
    public static void main(String[] args) {


        Scanner x = new Scanner(System.in);
        ex34 obj = new ex34();
        ArrayList<String> n=new ArrayList();
        n.add("John Smith");
        n.add("Jackie Jackson");
        n.add("Chris Jones");
        n.add("Amanda Cullen");
        n.add("Jeremy Goodwin");
        System.out.println("Enter a name to delete ");
        String del=x.nextLine();
        obj.remover(n,del);
        System.out.println("There are 4 employees:");
        int l=0;
        while(l<4)
        {
            System.out.println(n.get(l));
            l++;
        }
}
}
