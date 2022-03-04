package com.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static boolean checkIt(ArrayList<Integer> A , ArrayList<Integer> B , int n ){
        int c =0 ;
        for(int i=0 ; i<n ; i++){
            if(A.get(i) > B.get(i) ){
                c++;            }
        }

        if(c!=0){
            return false;
        }else{
            return true ;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> positions = new ArrayList<>();
        ArrayList<Integer> skills = new ArrayList<>();
        int n = scn.nextInt();
        for(int i=0 ; i < n ; i++ ){
            positions.add(scn.nextInt()) ;
        }
        for(int i=0 ; i < n ; i++ ){
            skills.add(scn.nextInt()) ;
        }
        Collections.sort(skills);
        Collections.sort(positions);
        int c = 0 ;
        int somme = 0 ;
        if(checkIt(positions , skills , n) == true){
            c=1 ;
            for (int i = 0; i < n; i++) {
                for (int j = c; j < n - 1; j++) {
                    if (skills.get(i) >= positions.get(j)) {
                        c++;
                    }
                }
            }
        }
        System.out.println(c);
    }
}
