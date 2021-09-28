/*
 *  UCF COP3330 Fall 2021 Assignment 27 Solution
 *  Copyright 2021 Diego Santiago
 */
package ex27;
import java.lang.*;
import java.util.*;



public class ex27
{
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String fn=x.nextLine();
        System.out.print("Enter the last name: ");
        String ln=x.nextLine();
        System.out.print("Enter the zipcode: ");
        String zc=x.nextLine();
        System.out.print("Enter the employee ID: ");
        String id=x.nextLine();

        String y=validateInput(fn,ln,zc,id);

        System.out.println(y);


        System.exit(0);
    }

    public static int firstName(String fn)
    {
        if (fn.length()<=2 && fn.length()>0)
        {
            return 0;
        }else if(fn.length()==0){
            return 1;
        }else {
            return 2;
        }
    }
    public static int lastName(String ln)
    {
        if (ln.length()<=2 && ln.length()>0)
        {
            return 0;
        }else if(ln.length()==0){
            return 1;
        }else {
            return 2;
        }
    }
    public static boolean zipCode(String zc)
    {
        try {
            int zcn = Integer.valueOf(zc);
        } catch (NumberFormatException exception) {
            return false;
        }
        return true;
    }
    public static boolean identification(String id)
    {
        if(id.matches("[a-zA-Z]{2}-\\d{4}")){
            return true;
        }else{
            return false;
        }
    }
    public static String validateInput(String fn, String ln, String zc, String id)
    {
        String s1=null;
        String s2=null;
        String s3=null;
        String s4=null;
        String error=null;
        String noerror="There were no errors found.";

        if(firstName(fn)==0)
        {
            s1="The first name must be at least 2 characters long.";
        }else if(firstName(fn)==1){
            s1=("The first name must be at least 2 characters long. \nThe first name must be filled in.");;
        }else if(firstName(fn)==2){
            s1="";
        }

        if(lastName(ln)==0)
        {
            s2="The last name must be at least 2 characters long.";
        }else if(lastName(ln)==1){
            s2=("The last name must be at least 2 characters long. \nThe last name must be filled in.");;
        }else{
            s2="";
        }

        if(zipCode(zc))
        {
            s3="";
        }else{
            s3="The zipcode must be a 5 digit integer.";
        }

        if(identification(id))
        {
            s4="";
        }else{
            s4="The employee ID must be in the format of AA-1234.";
        }

        error=(s1+"\n"+s2+"\n"+s4+"\n"+s3);

        if(s1!="" || s2!="" || s3!="" || s4!="")
        {
            return error;
        }else{
            return noerror;
        }

    }

}
