package com.myprojects.questionairre3;

public class Using_Bitwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=81;
		
        convert(a);
	
	}
	
	public static void convert(int a){
		if(a<=1){System.out.println(a); return;}
		int rem=a%2;
		convert(a>>1);
		System.out.println(rem);
		
	}

}
