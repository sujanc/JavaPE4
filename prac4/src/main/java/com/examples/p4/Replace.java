package com.examples.p4;

import java.security.PublicKey;
import java.util.Scanner;

public class Replace {

    public String replace(String str) {
        String rep = str.replace("d","f");
        rep = rep.replace("l","t");
        return rep;
    }


    public static void main(String args[])
    {Replace obj = new Replace();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String str =scan.nextLine();
        System.out.println(obj.replace(str));;

    }


}
