package com.capp.acc;

public class Account1 {
	private int accNumber;
	private int balance;
	public int getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account1(int accNumber, int balance) {
		super();
		this.accNumber = accNumber;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account1 [accNumber=" + accNumber + ", balance=" + balance + "]";
	}
	

}
