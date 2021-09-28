/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Diego Santiago
 */

package ex24;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class ex24
{

    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String s1 = x.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = x.nextLine();
        if (isAnagram(s1, s2)) {
            System.out.println("\""+s1+"\" and \""+s2+"\" are anagrams.");
        }else{
            System.out.println("\" "+s1+" \" and \" "+s2+"\" are not anagrams.");
        }


        System.exit(0);
    }

    public static boolean isAnagram(String s1, String s2)
    {

        if (s1.length() != s2.length())
        {
            return false;
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        int l = 0;
        while(l<s1.length())
        {
            if (a1[l] != a2[l]){
                return false;
            }
            l++;
        }
        return true;
    }
}
