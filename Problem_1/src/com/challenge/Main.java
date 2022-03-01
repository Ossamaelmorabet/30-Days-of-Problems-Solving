package com.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int s = scn.nextInt() ;
        int somme = 0 ;
        ArrayList myArray = new ArrayList() ;

        for(int i = 0 ; i < n ; i++){
            myArray.add(scn.nextInt());
            somme+= (int) myArray.get(i);
        }

        int add_value = 1 ;
        int addElements = 0  ;


   while(somme <s){

       if(!myArray.contains(add_value)){

           somme+= add_value ;
           addElements++;
          add_value++;
       }else{
           add_value ++ ;
       }
   }

        System.out.println(addElements + n );

    }}

