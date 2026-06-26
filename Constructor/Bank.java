package com.tcs.ilp;
 
public class Bank {
	
	
	public static void main(String[] args) {
		Account acc1= new Account(1,"Rama",1000, "Savings Account");
		System.out.println("Details of Acc1:" +acc1.getAccnumber());
		System.out.println(acc1.getAccountHolderNumber());
		System.out.println(acc1.getBalance());
		System.out.println(acc1.getType());
		
		Bank bank= new Bank();
		
		Account acc2= new Account(2,"Krish");
		System.out.println("Details of Acc2:" +acc2.getAccnumber());
		System.out.println(acc2.getAccountHolderNumber());
		System.out.println(acc2.getBalance());
		System.out.println(acc2.getType());
		
		double balancewithInterestSimple=bank.CalInterest(acc1.getBalance(),12);
		System.out.println("Details of Acc1:" +acc1.getAccnumber());
		System.out.println(acc1.getAccountHolderNumber());
		System.out.println(balancewithInterestSimple);
		
		
		double balancewithInterestCompound=bank.CalInterest(acc2.getBalance(),12, 4);
		System.out.println("Details of Acc2:" +acc2.getAccnumber());
		System.out.println(acc2.getAccountHolderNumber());
		System.out.println(balancewithInterestCompound);
	}
	
		public double CalInterest(double principal, float rateofInterest) {
			double principalAfterInterest=principal+principal*rateofInterest/100;
			return principalAfterInterest;
	}
		
		public double CalInterest(double principal, float rateofInterest,int noofTimeCompound) {
			double principalAfterInterest=principal* Math.pow(1+rateofInterest/(noofTimeCompound*100),noofTimeCompound);
			return principalAfterInterest;
		}
 }





























/*
 * package com.tcs.ilp;
 * 
 * public class Bank {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Account acc1=new Account();
 * 
 * 
 * acc1.accnumber=1; acc1.accountHolderNumber="Shreya"; acc1.balance=1000;
 * acc1.type="Savings";
 * 
 * 
 * Account acc2=new Account(2,"omgade",300000,"Savings");
 * 
 * 
 * acc2.accnumber=1; acc2.accountHolderNumber="OM"; acc2.balance=2000;
 * acc2.type="Savings";
 * 
 * Account acc3=new Account(acc2);
 * 
 * System.out.println("account no"+ acc1.accnumber);
 * System.out.println("account no"+ acc1.accountHolderNumber);
 * System.out.println("account no"+ acc1.balance);
 * System.out.println("account no"+ acc1.type);
 * 
 * System.out.println("account no"+ acc2.accnumber);
 * System.out.println("account no"+ acc2.accountHolderNumber);
 * System.out.println("account no"+ acc2.balance);
 * System.out.println("account no"+ acc2.type);
 * 
 * System.out.println("account no"+ acc3.accnumber);
 * System.out.println("account no"+ acc3.accountHolderNumber);
 * System.out.println("account no"+ acc3.balance);
 * System.out.println("account no"+ acc3.type);
 * 
 * 
 * 
 * 
 * }
 * 
 * }
 */