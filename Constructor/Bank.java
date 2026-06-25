package com.tcs.ilp;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1=new Account();
		
		/*
		 * acc1.accnumber=1; acc1.accountHolderNumber="Shreya"; acc1.balance=1000;
		 * acc1.type="Savings";
		 */
		
		Account acc2=new Account(2,"omgade",300000,"Savings");
		
		/*
		 * acc2.accnumber=1; acc2.accountHolderNumber="OM"; acc2.balance=2000;
		 * acc2.type="Savings";
		 */
		Account acc3=new Account(acc2);
		
		System.out.println("account no"+ acc1.accnumber);
		System.out.println("account no"+ acc1.accountHolderNumber);
		System.out.println("account no"+ acc1.balance);
		System.out.println("account no"+ acc1.type);
		
		System.out.println("account no"+ acc2.accnumber);
		System.out.println("account no"+ acc2.accountHolderNumber);
		System.out.println("account no"+ acc2.balance);
		System.out.println("account no"+ acc2.type);
		
		System.out.println("account no"+ acc3.accnumber);
		System.out.println("account no"+ acc3.accountHolderNumber);
		System.out.println("account no"+ acc3.balance);
		System.out.println("account no"+ acc3.type);
		
		
		

	}

}
