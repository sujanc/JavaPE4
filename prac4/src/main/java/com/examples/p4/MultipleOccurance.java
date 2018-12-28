package com.examples.p4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurance {

    public static void main(String args[]){
        MultipleOccurance  obj = new MultipleOccurance();
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        System.out.println("Enter the word");
        String word = scan.nextLine();
        obj.count(str,word);

    }

    public int count(String str, String word) {
        int c=0;
        Pattern pattern = Pattern.compile(word);
        Matcher m = pattern.matcher(str);
        while (m.find()) {
            c++;
            System.out.println("Pattern found from " + m.start() +
                    " to " + (m.end() - 1));
        }
        return c;
    }
}

