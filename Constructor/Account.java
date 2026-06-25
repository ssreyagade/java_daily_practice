package com.tcs.ilp;

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
