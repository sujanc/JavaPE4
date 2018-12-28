package com.examples.p4;

import java.util.Scanner;

public class NoOfOccurances {


    public int noOfOccurances(String str,String ch){
        String repl = str.replaceAll(ch,"");
        return (str.length()-repl.length());


    }

    public static void main(String args[])
    {   Scanner scan = new Scanner(System.in);
        NoOfOccurances obj = new NoOfOccurances();
        System.out.println("ENter the string");
        String str = scan.nextLine();
        System.out.println("Enter the character");
        String ch =scan.nextLine();
        int count = obj.noOfOccurances(str,ch);
        System.out.println(count);

    }
}
