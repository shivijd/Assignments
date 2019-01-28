package com.assign;

import java.io.IOException;
//class New extends StackTrace throws IndexOutOfBoundsException {
	//void main() {
		
//	}
//}
public class StackTrace {

	public static void main(String[] args)  {
		
		try{
			m1();
		}
		catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("ppp");
		
	}
	private static void m1() {//throws StringIndexOutOfBoundsException {
		String s="shivi";
		System.out.println(s.charAt(3));
//		throw new StringIndexOutOfBoundsException();
		
		System.out.println("Before m2 calling");
		m2();
	}
	private static void m2()throws ArithmeticException{
		int a=5;
		int b=0;
		int c=a/b;
		System.out.println("number is"+ c);
		//m3();		
}
//private static void m3() {
//			
	
//	}
}
