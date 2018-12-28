package com.examples.p4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegHarry {
    public static void main(String args[])
    {
        RegHarry obj = new RegHarry();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the String");
        String str = scan.nextLine();
        Boolean flag = obj.harry(str);
        System.out.println("Is Harry here? "+ flag);

    }

    public Boolean harry(String str) {
        Pattern pattern = Pattern.compile("Harry");
            Matcher m = pattern.matcher(str);
            if(m.find()){
                return true;
            }
            else
                return false;
        }
    }

