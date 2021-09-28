/*
 *  UCF COP3330 Fall 2021 Assignment 37 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex37;
import java.util.Collections;
import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;
import java.util.Random;

public class ex37 {

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("What's the minimum length? ");
        int length = Integer.parseInt(x.next());
        System.out.print("How many special characters? ");
        int ch =Integer.parseInt(x.next());
        System.out.print("How many numbers? ");
        int num =Integer.parseInt(x.next());

        System.out.println("Your password is "+passwordGen(length, ch, num));

    }
    public static String passwordGen(int length, int ch, int num)
    {
        Random random = new Random();
        int i=0;
        String password = "";
        ArrayList<String>l=new ArrayList();
        l.add("a");
        l.add("b");
        l.add("c");
        l.add("d");
        l.add("e");
        l.add("f");
        l.add("g");
        l.add("h");
        l.add("i");
        l.add("j");
        l.add("k");
        l.add("l");
        l.add("m");
        l.add("n");
        l.add("o");
        l.add("p");
        l.add("q");
        l.add("r");
        l.add("s");
        l.add("t");
        l.add("u");
        l.add("v");
        l.add("w");
        l.add("x");
        l.add("y");
        l.add("z");
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.add("F");
        l.add("G");
        l.add("H");
        l.add("I");
        l.add("J");
        l.add("K");
        l.add("L");
        l.add("M");
        l.add("N");
        l.add("O");
        l.add("P");
        l.add("Q");
        l.add("R");
        l.add("S");
        l.add("T");
        l.add("U");
        l.add("V");
        l.add("W");
        l.add("X");
        l.add("Y");
        l.add("Z");
        ArrayList<String>s=new ArrayList();
        s.add("!");
        s.add("$");
        s.add("@");
        s.add("%");
        s.add("^");
        s.add("#");
        s.add("&");
        s.add("*");
        ArrayList<String>n=new ArrayList();
        n.add("1");
        n.add("2");
        n.add("3");
        n.add("4");
        n.add("5");
        n.add("6");
        n.add("7");
        n.add("8");
        n.add("9");
        ArrayList<String>p=new ArrayList();

        while(i<num)
        {
            p.add(n.get(random.nextInt(n.size())));
            i++;
        }
        i=0;
        while(i<ch)
        {
            p.add(s.get(random.nextInt(s.size())));
            i++;
        }
        i=0;
        while(i<length-(ch+num) || i<ch+num)
        {
            p.add(l.get(random.nextInt(l.size())));
            i++;
        }
        Collections.shuffle(p);
        i=0;
        while(i<p.size())
        {
            password+=p.get(i);
            i++;
        }
        return password;
    }

}

