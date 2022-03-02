package com.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> myInitialArray = new ArrayList<>();
        myInitialArray.add("Alice");
        myInitialArray.add("Bob");
        myInitialArray.add("Cindy");
        myInitialArray.add("Dani");
        Scanner scn = new Scanner(System.in);
        ArrayList<String> inputArray = new ArrayList<>();
        for (int i =0 ; i < 3 ;i++){
            inputArray.add(scn.next());
        }
        int x = 0  ;
for(int i=0 ; i < 3 ; i++){
    if(!inputArray.contains((String) myInitialArray.get(i))){
        System.out.println(myInitialArray.get(i));
         x = 2 ;
    }
}
        if(x!=2){
            System.out.println(myInitialArray.get(3));
        }
  }
}
