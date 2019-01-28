package com.assign;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		String a=new String();
		int c=5;
		int b=0;
		try
		{
		try
		{
			if(a.length()==0)
				a=null;
			System.out.println("length"+ a.length());
			}
			catch(NullPointerException e)
			{
				System.out.println(e.toString());
			}
			
			try
			{
				int d=c/b;
				System.out.println("value"+d);
			}
			catch(ArithmeticException o)
			{
				try
				{
					if(c==5)
					System.out.println("True");
				}
				catch(RuntimeException p)
				{
					System.out.println(p.getMessage());
				}
				System.out.println(o.toString());
			}
		}
		
		finally{		
			try
			{
		System.out.println("length is "+a.length());
			}
			catch(RuntimeException j)
			{
				System.out.println(j.toString());
			}
		}
			{
	}
		System.out.println("end");
	}

}
