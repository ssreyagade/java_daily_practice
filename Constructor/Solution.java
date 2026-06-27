package com.tcs.ilp;
import java.util.*;


public class Solution {
	


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		TravelAgencies[] arr=new TravelAgencies[4];
		
		for(int i=0;i<arr.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			float d=sc.nextFloat();
			sc.nextLine();
			int e=sc.nextInt();
			sc.nextLine();
			
			arr[i]= new TravelAgencies(a,b,c,d,e);
			
			
		}
		int packageId= sc.nextInt();
		sc.nextLine();
		String Designation=sc.nextLine();
		
		TravelAgencies highest=TravelAgencies.findPackageWithHighestRating(arr);
		if(highest!=null) {
			System.out.println(highest.getPackageId());
			System.out.println(highest.getPackageName());
			System.out.println(highest.getDesignation());
			System.out.println(highest.getPrice());
			System.out.println(highest.getRating());
		}
		else {
			System.out.println("0");
		}
		
		
		TravelAgencies res= TravelAgencies.getPhonesGreaterThanPrice(arr,Designation);
		if(res!=null) {
			System.out.println(res.getDesignation());
		}
		else {
			System.out.println("No package found");
		}
		
	}
	
}	
	
	
	
class TravelAgencies{
		
		private int packageId;
		private String packageName;
		private String Designation;
		private float price;
		private int rating;
		

	public TravelAgencies(int packageId, String packageName, String Designation, float price, int rating) {
		this.packageId=packageId;
		this.packageName=packageName;
		this.Designation=Designation;
		this.price=price;
		this.rating=rating;
		
	}
	public int getPackageId() {
		return packageId;
	}
	public void setPackageId(int packageId) {
		this.packageId = packageId;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public static TravelAgencies findPackageWithHighestRating(TravelAgencies[] arr) {
		TravelAgencies max=arr[0];
		
		for (int i=1;i<arr.length;i++) {
			if (arr[i].getRating()>max.getRating()) {
				max=arr[i];
				return max;
			}
			
		}
		return null;
	}
	
	
	public static TravelAgencies getPhonesGreaterThanPrice(TravelAgencies[] arr, String Designation) {
		 for (int i=0;i<arr.length;i++) {
			 if(arr[i].getDesignation().equals(Designation)) {
				 return arr[i];
			 }
		 }
		 return null;
	}
}
