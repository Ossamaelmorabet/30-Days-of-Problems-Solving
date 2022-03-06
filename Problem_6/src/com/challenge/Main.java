package com.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt() ;
        ArrayList<Integer> A = new ArrayList<>() ;

        for(int i=0 ; i<n ; i++){
             A.add(scn.nextInt()) ;
        }
        int clc = 0 ;
        int t = 0 ;
        for(int i=0  ; i<n ; i++){
            clc++ ;
            if(A.get(i) == 0 ){
                t = 1 ;
                break ;
            }
        }
        if(t==1)
        System.out.println(clc);
        else System.out.println(0);
    }
}
