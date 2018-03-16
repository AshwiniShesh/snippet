package com.myprojects.questionairre6;

import java.util.Scanner;

public class Solution {
	static boolean search(int num, int[] arr) {
		int max = arr.length-1, min = 0, mid = (max + min) / 2;
		boolean there=false;;
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		while(max!=min) {
			System.out.println("looping");
			if(num>arr[mid]){
				System.out.println(" array mid: "+arr[mid]);
				min=mid;
				System.out.println("min: "+min);
				mid=(max+min)/2;
			}
			if(num<arr[mid]){
				System.out.println("mid2: "+mid);
				max=mid;
				System.out.println("max: "+max);
				mid=(max+min)/2;
			}
			if(num==arr[mid]) {there = true; break;}
			if((max-min)==1 && num!=arr[mid]){ there=false; break;}
		}
		 return there;
		
				}

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the elements in sorted way");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// TODO Auto-generated method stub
		System.out.println("enter the number needs to searched");
		int num = sc.nextInt();

		boolean isthere = search(num, arr);
		System.out.println((isthere) ? "number is present" : "invalid");
		sc.close();
	}

}
