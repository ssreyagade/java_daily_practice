package com.tcs.ilp;

import java.util.*;

public class Account{
	
	private int accnumber;
	private String accountHolderNumber;
	private double balance;
	private String type;
	
	Account(int accnumber, String accountHolderNumber, double balance, String type){
		this.accnumber=accnumber;
		this.accountHolderNumber=accountHolderNumber;
		this.balance=balance;
		this.type=type;
	}
	
	Account(int accnumber, String accountHolderNumber){
		this.accnumber=accnumber;
		this.accountHolderNumber=accountHolderNumber;
		this.balance=5000;
		this.type="Current Account";
		}
	
	public void setAccnumber(int accnumber) {
		this.accnumber=accnumber;
	}

	public int getAccnumber() {
		return accnumber;
	}

	public String getAccountHolderNumber() {
		return accountHolderNumber;
	}

	public void setAccountHolderNumber(String accountHolderNumber) {
		this.accountHolderNumber = accountHolderNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
























/*package com.tcs.ilp;

 
 
public class Account {
	
	int accnumber;
	String accountHolderNumber;
	float balance;
	String type;
	
	Account(){
		accnumber=1;
		accountHolderNumber="Shreya";
		balance=1000;
		type="Savings";
	}
	
	Account(int accnumber,String accountHolderNumber, float balance,String type){
		this.accnumber=accnumber;
		this.accountHolderNumber=accountHolderNumber;
		this.balance=balance;
		this.type=type;
	}
	
	Account(Account acc3){
		this.accnumber=acc3.accnumber;
		this.accountHolderNumber=acc3.accountHolderNumber;
		this.balance=acc3.balance;
		this.type=acc3.type;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
*/