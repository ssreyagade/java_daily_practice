package com.tcs.ilp;
import java.util.*;

class Solution3{

public static int findPrice(Phones[] p, String brand){
	int sum=0;
	for(int i=0;i<p.length;i++){
		if(p[i].getbrand().equalsIgnoreCase(brand)){
			sum=sum+p[i].getprice();
		}
	}
	if(sum!=0){
		return sum;}
	else{
		return 0;
	}
	
}


public static Phones getPhoneos(Phones[] p, String os){
	for(int i=0; i < p.length;i++){
		if(p[i].getos().equalsIgnoreCase(os) && p[i].getprice()>=50000){
			return p[i];
		}
	}return null;
}



public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Phones[] ph=new Phones[4];

	for(int i=0;i<ph.length;i++){
		int a=sc.nextInt();sc.nextLine();
		String b=sc.nextLine();
		String c=sc.nextLine();
		int d=sc.nextInt();
		sc.nextLine();

		ph[i]=new Phones(a,b,c,d);
	}
	String brand= sc.nextLine();
	String os=sc.nextLine();
	
	int re1=findPrice(ph,brand);
	if(re1>0){
		System.out.println(re1);
	}
	else{
		System.out.println("The brand not available");
	}

	Phones res2=getPhoneos(ph, os);
	if(res2 != null){
	    System.out.println(res2.getphoneId());
	}
	else{
	    System.out.println("No phones found");
	}
}

}


class Phones{
	private int phoneId;
	private String os;
	private String brand;
	private int price;

	public Phones(int phoneId, String os, String brand, int price){
		this.phoneId=phoneId;
		this.os=os;
		this.brand=brand;
		this.price=price;
	}
	
	public int getphoneId(){
		return phoneId;
	}
	public String getos(){
		return os;
	}
	public String getbrand(){
		return brand;
	}
	public int getprice(){
		return price;
	}
}









/*package com.tcs.ilp;

import java.util.Scanner;

class Solution3{

	public static int fingAgencyHighestPackagePrice(TravelAgency[] a){
	int highest=a[0].getPrice();

	for(int i=1;i<a.length;i++){
		if(highest<a[i].getPrice()){
			highest=a[i].getPrice();
		}
	}return highest;
}

	public static TravelAgency agencyDetailsForGivenIdandType(TravelAgency[] a, int regno, String packageType){
		for(int i=0;i<a.length;i++){
			if(a[i].getflightFacility()==true){
				if(a[i].getregno()==regno && a[i].getpackageType().equalsIgnoreCase(packageType)){
					 return a[i];
				}
			}
		}
		return null;
	}



 	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
	
		TravelAgency[] ag= new TravelAgency[4];
		for(int i=0;i<ag.length;i++){
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			sc.nextLine();
			Boolean e=sc.nextBoolean();sc.nextLine();
	
			ag[i]= new TravelAgency(a,b,c,d,e);
		}
		int regno= sc.nextInt();sc.nextLine();
		String packageType= sc.nextLine();
		
		int res1= fingAgencyHighestPackagePrice(ag);
		System.out.println(res1);
	
		TravelAgency res2= agencyDetailsForGivenIdandType(ag, regno, packageType);
		if(res2 != null){
		    System.out.println(res2.getagencyName());
		    System.out.println(res2.getPrice());
		}
		else{
		    System.out.println("No Agency Found");
		}
 	}
}

class TravelAgency{
	private int regno;
	private String agencyName;
	private String packageType;
	private int price;
	private boolean flightFacility;

	public TravelAgency(int regno, String agencyName, String packageType, int price, boolean flightFacility){
	this.regno=regno;
	this.agencyName=agencyName;
	this.packageType=packageType;
	this.price=price;
	this.flightFacility=flightFacility;
	}
	public int getregno(){
		return regno;
	}
	public String getagencyName(){
		return agencyName;
	}
	public String getpackageType(){
		return packageType;
	}
	public int getPrice(){
		return price;
	}
	public Boolean getflightFacility(){
		return flightFacility;
	}
	
}

*/