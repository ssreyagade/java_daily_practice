package com.tcs.ilp;
import java.util.*;


class Solution3 {

	public static int countOfLaptopsByBrand(Laptop[] lap,String brand){
		int count=0;
		for(int i=0;i<lap.length;i++){
			if(lap[i].getbrand().equalsIgnoreCase(brand) && lap[i].getrating()>3){
				count++;
			}
		}if(count == 0){
		    return 0;
		}
		else {
			return count;
		}
	}


	public static Laptop[] searchLaptopByOsType(Laptop[] lap, String osType){
		int count=0;
		
		for(int i=0;i<lap.length;i++){
			if(lap[i].getosType().equalsIgnoreCase(osType)){
				count++;
			}
		}
		Laptop[] newlap=new Laptop[count];
		int j=0;
		for(int i=0;i<lap.length;i++){
			if(lap[i].getosType().equalsIgnoreCase(osType)){
				newlap[j]=lap[i];
				j++;
			}
		}
		
		for(int i=0;i<count-1;i++){
			for(int k=i+1;k<count;k++){
				if(newlap[i].getlaptopId()>newlap[k].getlaptopId()){
				Laptop temp= newlap[i];
				newlap[i]=newlap[k];
				newlap[k]=temp;
				}
			}
		}
		Laptop[] finalres=new Laptop[count];

		for(int i=0;i<count;i++){
			finalres[i]=newlap[i];
		}				

		return finalres;
	}
	

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Laptop[] array= new Laptop[4];

		for(int i=0;i<array.length;i++){
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			double d=sc.nextDouble();sc.nextLine();
			int e=sc.nextInt();sc.nextLine();

			array[i]=new Laptop(a,b,c,d,e);
			
		}
		String brand=sc.nextLine();
		String osType=sc.nextLine();

		Laptop[] output2=searchLaptopByOsType(array, osType);
		if(output2==null){
			System.out.println("No output");
		}
		else{
			for(int i=0;i<output2.length;i++){

				System.out.println(output2[i].getlaptopId());
				System.out.println(output2[i].getrating());

				}
			}
		int output1=countOfLaptopsByBrand(array,brand);
		System.out.println(output1);
		}

}



class Laptop{
	private int laptopId;
	private String brand;
	private String osType;
	private double price;
	private int rating;

public Laptop(int laptopId, String brand, String osType, double price, int rating){
	this.laptopId=laptopId;
	this.brand=brand;
	this.osType=osType;
	this.price=price;
	this.rating=rating;
}

public int getlaptopId(){
	return laptopId;
}
public String getbrand(){
	return brand;
}
public String getosType(){
	return osType;
}
public double getprice(){
	return price;
}
public int getrating(){
	return rating;
}

}




/*class Solution3{
	public static Inventory[] replenish(Inventory[] inv, int limit){
		int count=0;
		for(int i=0;i<inv.length;i++) {
			if(inv[i].getthreshold()>=limit) {
				count++;
			}
		}
		if (count==0) {
			return null;
		}
	 int j=0;
	 Inventory[] newinv = new Inventory[count];

		for(int i=0;i<inv.length;i++){
			if(inv[i].getthreshold()>=limit){
				newinv[j]=inv[i];
				j++;
			}
		}return newinv;
	
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Inventory[] array= new Inventory[4];

		for(int i=0;i<array.length;i++){
			int a=sc.nextInt();
			sc.nextLine();
			int b=sc.nextInt();sc.nextLine();
			int c=sc.nextInt();sc.nextLine();
			int d=sc.nextInt();sc.nextLine();

			array[i]=new Inventory(a,b,c,d);
			
		}
		int limit=sc.nextInt();sc.nextLine();

		Inventory[] res=replenish(array, limit);
		
		if(res!=null) {
			for(int i=0;i<res.length;i++) {
				if(res[i].getthreshold()>75){
					System.out.println(res[i].getinventoryId()+"Critical filling");	
				}
				else if(res[i].getthreshold()>= 50 && res[i].getthreshold()<=75){
					System.out.println(res[i].getinventoryId()+"Moderate Filling");
				}
				else{
					System.out.println(res[i].getinventoryId()+"Non-Critical Filling");
				}
			}
		}
		
	}


}

class Inventory{

	private int inventoryId;
	private int maximumQuantity;
	private int currentQuantity;
	private int threshold;

public Inventory(int inventoryId, int maximumQuantity, int currentQuantity, int threshold){
	this.inventoryId=inventoryId;
	this.maximumQuantity=maximumQuantity;
	this.currentQuantity=currentQuantity;
	this.threshold=threshold;
}

public int getinventoryId(){
	return inventoryId;
}
public int getmaximimQuantity(){
	return maximumQuantity;
}
public int getcurrentQuantity(){
	return currentQuantity;
}
public int getthreshold(){
	return threshold;
}

}


/*class Solution3{

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