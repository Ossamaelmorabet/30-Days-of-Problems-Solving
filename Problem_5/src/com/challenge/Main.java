package com.challenge;

import java.util.Scanner;

public class Main {

    public static  int pb_4(int n ) {
        if ( n == 0 ) {
            return 2;

        }else if(n==1){
            return 3 ;
        }else{
            return 2*pb_4(n-1) - pb_4(n-2) +2 ;
        }}

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in) ;
        int n = scn.nextInt();
        System.out.println(pb_4(n));

    }
}
