package com.examples.p4;

import java.util.Scanner;

public class Transpose {

    public static void main(String args[])
    {
        Transpose obj = new Transpose();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the String");
        String str = scan.nextLine();
        System.out.println(obj.transpose(str));;
    }

    public String transpose(String str) {
        String trans = "";
        String rev[]=str.split(" ");
                for(int i=0;i<rev.length;i++) {


                   StringBuffer sb1= new StringBuffer(rev[i]);
                   trans=trans+sb1.reverse()+" ";

                }
                return trans.trim();
    }
    }

