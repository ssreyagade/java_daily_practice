package com.tcs.ilp;
import java.util.*;


public class Solution6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Medicine[] med=new Medicine[4];
		
		for(int i=0;i<med.length;i++) {
			String a=sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			sc.nextLine();
			
			med[i]=new Medicine(a,b,c,d);
			}
		
			String disease=sc.nextLine();
			
			int[] a1=getPriceByDisease(med,disease);
			if(a1==null) {
				System.out.println("Medicine not found");
			}
			else {
				for(int i=0;i<a1.length;i++) {
					System.out.println(a1[i]);
				}
			}
	}
	
	public static int[] getPriceByDisease(Medicine[] m, String disease) {
		int[] array=new int[0];
		
		for(int i=0;i<m.length;i++) {
			if(m[i].getDisease().equalsIgnoreCase(disease)) {
				array=Arrays.copyOf(array, array.length+1);
				array[array.length-1]=m[i].getPrice();
				Arrays.sort(array);
			}
		}
		if(array.length>0) {
			return array;
		}
		else {
			return null;
		}
	}

}





class Medicine{
	
	private String medicineName;
	private String batch;
	private String disease;
	private int price;
	
	public Medicine(String medicineName, String batch, String disease, int price) {
		super();
		this.medicineName = medicineName;
		this.batch = batch;
		this.disease = disease;
		this.price = price;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
