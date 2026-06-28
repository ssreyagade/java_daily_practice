package com.tcs.ilp;
import java.util.*;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Institution[] arr=new Institution[4];
		
		for (int i=0;i<arr.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			int c=sc.nextInt();
			sc.nextLine();
			double d=sc.nextDouble();
			sc.nextLine();
			String e=sc.nextLine();
			
			arr[i]=new Institution(a,b,c,d,e);
		}
		
		String location=sc.nextLine();
		String institutionName=sc.nextLine();
		
		Institution arr1=findInstitutionWithMaximumRating(arr);
		if(arr1!=null) {
			System.out.println(arr1.getInstitutionId());
		    System.out.println(arr1.getInstitutionName());
		    System.out.println(arr1.getNumberOfStudents());
		    System.out.println(arr1.getRating());
		    System.out.println(arr1.getLocation());
		}
		else {
			System.out.println("Not found");
		}
		
		Institution arr2=searchInstitutionByLocation(arr, location);
			if(arr2!=null) {
				System.out.println(arr2.getLocation());
			}
			else {
				System.out.println("Not found");
			}
			
			Institution arr3 = updateInstiGrade(arr, institutionName);

			if(arr3 != null) {
			    System.out.println(arr3.getGrade());
			}
			else {
			    System.out.println("Not found");
			}
		
			int arr4= findNumClearanceByLoc(arr,location);
			System.out.println("sum"+arr4);
	}		
		
		public static Institution findInstitutionWithMaximumRating(Institution[] arr) {
			Institution max=arr[0];
			for(int i=0;i<arr.length;i++) {
				
				if(max.getRating()<arr[i].getRating()) {
					max=arr[i];
				}
				
			}
			return max;
			
		}
		
		public static Institution searchInstitutionByLocation(Institution[] arr, String location) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i].getLocation().equals(location)) {
					return arr[i];
				}
			
			}
			return null;
			
		
		}
		
		public static int findNumClearanceByLoc(Institution[] arr, String location) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i].getLocation().equals(location)) {
					sum=sum+arr[i].getNumberOfStudents();
				}
			}
			return sum;
		}
	
		public static Institution updateInstiGrade(Institution[] arr, String institutionName) {
			for (int i=0;i<arr.length;i++) {
				if(arr[i].getInstitutionName().equals(institutionName)) {
					int Rating= (arr[i].getNumberOfStudents()*100)/100;
					if(Rating>=80) {
						arr[i].setGrade("A");
					}
					else if (Rating >=70) {
						arr[i].setGrade("B");
					}
					else if (Rating >=60) {
						arr[i].setGrade("c");
					}
					else {
						arr[i].setGrade("D");
					}
					return arr[i];
				}
				
				
				
			}
			return null;
		}



}
class Institution{
	
	private int institutionId;
	private String institutionName;
	private int numberOfStudents;
	private double rating;
	private String location;
	private String grade;
	
	public Institution(int institutionId,String institutionName,int numberOfStudents, double rating, String location) {
		this.institutionId=institutionId;
		this.institutionName=institutionName;
		this.numberOfStudents=numberOfStudents;
		this.rating=rating;
		this.location=location;
		
	}
	
	public int getInstitutionId() {
		return institutionId;
	}
	public void setInstitutionId(int institutionId) {
		this.institutionId=institutionId;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	
	
}
