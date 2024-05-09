package com.kodnest.smpi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SmallestMissingPositiveInteger {
	public static int findSmallestMissingInteger(List<Integer> nums) {
        for(int i=0; i<nums.size(); i++){
        	int num = i+1;
        	int ele = nums.get(i);
        	if(num != ele) {
        		return num;
        	}
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] a = new int[r][c];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                if(a[i][j] > 0){
                    arr.add(a[i][j]);
                }
            }
        }
        Collections.sort(arr);
        sc.close();
        int smallNumber = findSmallestMissingInteger(arr);
        System.out.println("Smallest Missing Positive Integer: " + smallNumber);
    }
}
