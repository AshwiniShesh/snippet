package com.myprojects.questionairre1;

public class Difference {
	private int[] elements;
	public int maximumDifference;

	Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		int min_int=100, max_int=0;  // constraint: 1<=a[i]<=100
		for(int el: elements){
			if(el<min_int)min_int=el;
			if(el>max_int)max_int=el;}
	
		maximumDifference=Math.abs(min_int-max_int);	
		// ******* if no constraint *********
		
		int min_intt=Integer.MAX_VALUE, max_intt=Integer.MIN_VALUE;
		
		for(int el: elements){
			if(el<min_intt)min_intt=el;
			if(el>max_intt)max_intt=el;
		}
		maximumDifference=Math.abs(max_intt-min_intt);

		// ************* you can also sort the array and subtract 1st element from last with Math.abs **********
		

	}
}
