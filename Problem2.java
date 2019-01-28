package com.assign;

import java.util.Scanner;

public class Problem2 { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char [] s1A=s1.toCharArray();
		int f=0;

		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1A[i]<s1A[i+1])
				f=1;				//System.out.println("Not positive String");
			else
				f=0;			
		}
		if(f==1)
		
			System.out.println("positive string");
		else
			System.out.println("negative string");
	}
}

