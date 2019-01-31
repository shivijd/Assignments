package com.cap.bus;
import com.capp.acc.Account1;
import java.util.LinkedList;
import com.ex.cap1.InvalidAccountNumberException;
import com.ex2.cap1.InsufficientBalanceException;
public class BusiIcici {
	 LinkedList<Account1> accounts=new LinkedList<>();
	  public String createAccount(int accNumber,int balance)
	  {
		  Account1 acc=new Account1(accNumber, balance);
		  accounts.add(acc);
		return "account added";	  
	  }
	  private Account1 searchAccount(int accNumber)throws InvalidAccountNumberException
	  {
		  for(Account1 acc:accounts)
		  {
			  if(acc.getAccNumber()==accNumber)
				  return acc;
		  }
	throw new InvalidAccountNumberException();
	}
	  public int withdraw(int accNumber,int amount)throws InsufficientBalanceException,InvalidAccountNumberException
	  {
		  Account1 acc=searchAccount(accNumber);
		  if(acc.getBalance()-amount>=0)
		  {
			  acc.setBalance(acc.getBalance()-amount);
			  return acc.getBalance();
		  }
		  throw new InsufficientBalanceException();
	  }
	public int deposit(int accNumber,int amount) throws InvalidAccountNumberException
	{
		Account1 acc=searchAccount(accNumber);
			acc.setBalance(acc.getBalance()+amount);
			return acc.getBalance();
	}
	public String fundTransfer(int accNumber,int accNumber2,int am)throws InsufficientBalanceException,InvalidAccountNumberException 
	{
		Account1 acc=searchAccount(accNumber);
		Account1 acc1=searchAccount(accNumber2);
		if(acc1.getAccNumber()==accNumber2)
		{
		deposit(accNumber,am);
		withdraw(accNumber2,am);
		}
		return  "balance of 1st candidate"+" "+ acc1.getBalance()+" and "+"balance of 2nd candidate"+" "+acc.getBalance();			
	}
	}


