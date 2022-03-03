package com.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

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
        for(int i=0 ; i<n ; i++){
            if(positions.get(i) > skills.get(i) ){
c++;            }
        }

        if(c!=0 ){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }


}
