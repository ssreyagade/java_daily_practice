package com.tcs.ilp;
import java.util.*;

public class Phone {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		mobile[] arr=new mobile[4];
		
		for (int i=0;i<arr.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			sc.nextLine();
			
			arr[i]= new mobile(a,b,c,d);
			}
		
		String brand = sc.nextLine();
		int price = sc.nextInt();
		
		int sum = mobile.findPriceForGivenBrand(arr, brand);

		if(sum == 0) {
		    System.out.println("The given brand is not available");
		}
		else {
		    System.out.println(sum);
		}
		
		mobile result = mobile.getPhonesGreaterThanPrice(arr, price);

		if(result != null) {
		    System.out.println(result.getPhoneID());
		    System.out.println(result.getOs());
		    System.out.println(result.getBrand());
		    System.out.println(result.getPrice());
		}
		else {
		    System.out.println("No phone found");
		}
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object getBrand() {
		// TODO Auto-generated method stub
		return null;
	}


}


class mobile{
	private int phoneID;
	private String os;
	private String brand;
	private int price;
	
	mobile(int phoneID, String os,String brand,int price){
		this.phoneID=phoneID;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}

	public int getPhoneID() {
		return phoneID;
	}

	public void setPhoneID(int phoneID) {
		this.phoneID = phoneID;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public static int findPriceForGivenBrand(mobile[] arr, String brand) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getBrand().equals(brand)){
				sum=sum+arr[i].getPrice();
			}
		}
		if(sum<0) {
			return 0;
		}
		else {
			return sum;
		}
	}
	
	public static mobile getPhonesGreaterThanPrice(mobile[] arr, int price) {
		for(int i = 0; i < arr.length; i++) {

	        if(arr[i].getPrice() > price) {
	            return arr[i];
	        }

	    }

	    return null;
	}

	
}