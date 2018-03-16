package com.myprojects.questionairre8;

import java.awt.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author Ashwini  
 *         
 */

/*
 * Given a base-10 integer, , convert it to binary (base-2). Then find and print
 * the integer denoting the maximum number of consecutive 1's in binary
 * representation.
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String con = Integer.toBinaryString(n);
		System.out.println("The binary of the number: " + n + " is");
		int q;
		Stack<Integer> remainder = new Stack<Integer>();
		while (n >= 1) {
			remainder.push((n % 2));
			q = n / 2;
			n = q; // or n=n/2;
		}

		
		// ****************************** o/p needs to be reversed ******
		Collections.reverse(remainder);
		String binNum=remainder.toString().replaceAll("[^a-zA-Z0-9]", "");  
		// **** very imp to replace all chars. remember: [1, 0, 0] size=9 ****
		System.out.println(binNum);
		
		
		System.out.println("Int to binary using built in method: " + con);

		// ****** problem number 3 solution starts ********
		char[] binaryNum = binNum.toCharArray();
		int count = 0, max_count = 0;
		for (int i = 0; i < binaryNum.length; i++) {

			if (binaryNum[i] == '0') {
				count = 0;

			} else {
				count++;
				if (count > max_count)
					max_count = count;
			}
		}
		System.out.println("Maximum number of consecutive 1's: " +max_count);

// ******** problem 4 solution starts ************
		String[] binarySplit=binNum.split("0");
		int max_length=0;
		for(String str: binarySplit){System.out.println(str);}
		for(String st:binarySplit){
			if(st.length()>max_length) max_length=st.length(); 
		}
		System.out.println("Max number of consec 1's using String split method: "+max_length);
		
	}

	
}
