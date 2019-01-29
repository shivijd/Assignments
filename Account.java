package com.assign;

public class Account {
long accountNo;
double balance=500;
//personn accHolder;
public Account(long accountNo, double balance) {
	super();
	this.accountNo = accountNo;
	this.balance = balance;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void Deposit(double amount)
{
	balance+=amount;
	//System.out.println("updated amount is"+balance);
}
public void Withdraw(double amount)
{
	balance-=amount;
	//System.out.println("updated amount is"+balance);
}

}
