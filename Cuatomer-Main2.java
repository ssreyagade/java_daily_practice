package com.tcs.ipa.arrays;
import java.util.*; 

public class Main2 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Customer[] cust=new Customer[3];
		
		for(int i=0;i<cust.length;i++) {
			int id = sc.nextInt(); sc.nextLine();
		    String name = sc.nextLine();
		    String address = sc.nextLine();
		    int phone = sc.nextInt(); sc.nextLine();
		    int accountno = sc.nextInt();sc.nextLine();
		    String accountType = sc.nextLine();

		    cust[i] = new Customer(id, name, address, phone, accountno, accountType); 
		}
		int id = sc.nextInt(); sc.nextLine();
	    String name = sc.nextLine();
	   
		
		boolean b= checkCustomerExistence(cust,name);
		if(b==true) {
			System.out.println("Customer Exists");
		}
		else {
			System.out.println("Cust doesnot exits");
		}
		
		int c=getCountOfAccount(cust,name);
		if(c<0) {
			System.out.println("No acc");
		}
		else {
			System.out.println("No of ACC"+ c);
		}
		
		int u=updatecustomerId(cust,id,900);
		if(u==1) {
			System.out.println("Customer id successfully updated");
		}
		else {
			System.out.println("No updated");
		}
		
		int[] cu=getAccounts(cust, name);
		for(int i=0;i<cu.length;i++) {
			System.out.println(cu[i]);
		}
		
		
		for(int x = 0; x < cust.length; x++) {
	        System.out.println(cust[x]);
	    }
	    
	    
		
		  for(int x = 0; x < cust.length; x++) {
		  
		  System.out.println("Customer " + (x + 1));
		  
		  System.out.println("ID: " + cust[x].getCustomerId());
		  
		  System.out.println("Name: " + cust[x].getCustomerName());
		  
		  System.out.println("Address: " + cust[x].getCustomerAdress());
		  
		  System.out.println("Phone: " + cust[x].getContactNumber());
		  
		  System.out.println("Account Number: " + cust[x].getAccountNumber());
		  
		  System.out.println("Account Type: " + cust[x].getAccountType());
		  
		  System.out.println();
		  
		  }
		 

	}
	
	public static boolean checkCustomerExistence(Customer[] c, String name) {
		boolean exists=false;
		
		for(Customer cust:c) {
			if(cust.getCustomerName().equals(name)) {
				exists=true;
			}
		}
		return exists;
	}
	public static int getCountOfAccount(Customer[] c, String name) {
		int count=0;
		
		for(Customer cust:c) {
			if(cust.getCustomerName().equals(name)) {
				count=count+1;
			}
		}
		return count;
	}
	public static int updatecustomerId(Customer[] c, int id, int updatedId) {
		
		for(Customer cust:c) {
			if(cust.getCustomerId()==id) {
				cust.setCustomerId(updatedId);
				return 1;
			}
			
		}
		return 0;
	}
	
	public static int[] getAccounts(Customer[] c, String name) {
		
		int[] array=new int[10];
		int k=0;
		
		for(Customer cust:c) {
			if(cust.getCustomerName().equals(name)) {
				array[k]=cust.getAccountNumber();
				k++;
			}
		}
		return array;
	}

}

class Customer{
	private int customerId;
	private String customerName;
	private String customerAdress;
	private int contactNumber;
	private int accountNumber;
	private String accountType;
	
	public Customer(int customerId, String customerName, String customerAdress, int contactNumber, int accountNumber, String accountType) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerAdress=customerAdress;
		this.contactNumber=contactNumber;
		this.accountNumber=accountNumber;
		this.accountType=accountType;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAdress() {
		return customerAdress;
	}

	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	
	
}
