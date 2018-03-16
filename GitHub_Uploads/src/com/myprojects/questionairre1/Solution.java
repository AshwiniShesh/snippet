package com.myprojects.questionairre1;
/**
 * The absolute difference between two integers,  and , is written as . 
 * The maximum absolute difference between two integers in a set of positive integers, , 
 * is the largest absolute difference between any two integers in .

The Difference class is started for you in the editor. 
It has a private integer array () for storing  non-negative integers, 
and a public integer () for storing the maximum absolute difference.

Task 
Complete the Difference class by writing the following:

A class constructor that takes an array of integers as a parameter and saves it to the  instance variable.
A computeDifference method that finds the maximum absolute difference between any  numbers in  and stores it in the  instance variable.
Input Format

You are not responsible for reading any input from stdin. The locked Solution class in your editor reads in  lines of input; the first line contains , and the second line describes the  array.

Constraints 1<=N,<=10 where 1<=elements[i]<=100
 
Output Format: You are not responsible for printing any output; the Solution class will print the value of the  instance variable.

Sample Input

3
1 2 5
Sample Output

4
 */

/**
 * @author Ashwini 
 */
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);

	}

}
