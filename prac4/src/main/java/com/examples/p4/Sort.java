package com.examples.p4;

import java.util.*;

public class Sort {
    public static void main(String args[]){
        Sort obj= new Sort();
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the paragraph");
        String str = scan.nextLine();
        String print[]= obj.sortWord(str);
        for(int i=0;i<print.length;i++)
            System.out.print(print[i]+" ");

    }

    public String[] sortWord(String str) {
        List<String> rep =new ArrayList<>();
        String replace[]= str.split(" ");
        Arrays.sort(replace);

return replace;
    }
}
