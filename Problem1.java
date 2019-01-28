package com.assign;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s3=" ";
			System.out.println("enter the choice you want to be");
			System.out.println(" 1.add name to itself");
			System.out.println("2. replace alpha with # in odd position");
            System.out.println("3. remove duplicate caharacter");
            System.out.println("4. change odd character to upper case");
            while(true)
            {
			int ch;
		
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: System.out.println("addition of name to itself is"+" "+s1+s1);
			break;
			case 2:for(int i=0;i<s1.length();i++)
			{
				if(i%2==0)
					s3=s3+"#";
				else
					s3=s3+s1.charAt(i);
			}
			System.out.println(s3);
			break;
			case 3:
				s3="";
				for(int i=0;i<s1.length();i++){
				if(s3.indexOf(""+s1.charAt(i)) == -1) {
					s3 += s1.charAt(i);
				}
			
			}
			System.out.println(s3);
			break;
			case 4:
				s3="";
				for(int i=0;i<s1.length();i++)
				{
				if(i%2==0)

					s3 = s3+Character.toUpperCase(s1.charAt(i));
				else
					s3=s3+s1.charAt(i);
				}
				System.out.println(s3);
				break;
			
	}
	}
}
}
