package com.assign;

import java.util.Scanner;

public class Maiin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	for(int i=1;i<3;i++)
		{
		Scanner sc=new Scanner(System.in);
		Long a=sc.nextLong();		
	    Double p=sc.nextDouble();
		String s=sc.next();
		Float f=sc.nextFloat();
		*/		
		{
		Personn smith=new Personn(13547, 2000.0, "smith", 23);
		Personn kathy=new Personn(13644, 3000.0, "kaithy", 25);
        smith.Deposit(2000);
        kathy.Withdraw(3000);
       System.out.println("smith balance is"+smith.getBalance());
       System.out.println("kathy balance is"+kathy.getBalance());

System.out.println(smith.toString());
System.out.println(kathy.toString());
	}

}
	}


