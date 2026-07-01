package com.tcs.ilp;
import java.util.*;


public class EmployeePerformance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Employee[] emp=new Employee[4];
		
		for(int i=0;i<emp.length;i++) {
			int a=sc.nextInt();
			sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();;
			int d=sc.nextInt();
			sc.nextLine();
			double e=sc.nextDouble();sc.nextLine();
			double f=sc.nextDouble();sc.nextLine();
			String g=sc.nextLine();
			
			emp[i]=new Employee(a,b,c,d,e,f,g);
		}
		
		String department=sc.nextLine();
		int minimumExperience=sc.nextInt();
		
		
		Employee[] em = getExperiencedEmployees(emp, minimumExperience);

		if(em != null) {
		    for(Employee x : em) {
		        System.out.println(x.getEmployeId());
		        System.out.println(x.getEmployeeName());
		        System.out.println(x.getExperience());
		        System.out.println(x.getSalary());
		        System.out.println(x.getPromotionStatus());
		    }
		} else {
		    System.out.println("No employee found");
		}
		
		double dd=findAverageSalaryByDepartment(emp,department);
		if(dd == 0)
		    System.out.println("Department not found");
		else
		    System.out.println(dd);
		Employee ex=updatePromotionStatus(emp);
		

		if(ex != null) {
		    System.out.println(ex.getEmployeId());
		    System.out.println(ex.getEmployeeName());
		}
		else {
		    System.out.println("No eligible employee");
		}

	}

	
	
	public static double findAverageSalaryByDepartment(Employee[] e, String department) {
		double sum=0;
		double count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getDepartment().equals(department)) {
				sum=sum+e[i].getSalary();
				count++;
			}
			
			}
		if(count == 0) {
			return 0;
		}return sum/count;
	}
	
	public static Employee updatePromotionStatus(Employee[] e) {
		Employee highest=null;
		for(int i=0;i<e.length;i++) {
			if(e[i].getExperience()>=5 && e[i].getPerformanceRating()>=4.5) {
				e[i].setPromotionStatus("Eligible");
				if(highest == null ||
					       e[i].getPerformanceRating() > highest.getPerformanceRating() ||
					      (e[i].getPerformanceRating() == highest.getPerformanceRating() &&
					       e[i].getSalary() > highest.getSalary()) ||
					      (e[i].getPerformanceRating() == highest.getPerformanceRating() &&
					       e[i].getSalary() == highest.getSalary() &&
					       e[i].getEmployeId() < highest.getEmployeId())) {

					        highest = e[i];
					    }
			}
			else {
				e[i].setPromotionStatus("Not Eligible");
			}
			
		}
		if(highest==null) {
			return null;
		}
		return highest;
	}
	
	public static Employee[] getExperiencedEmployees(Employee[] e, int minimumExperience) {
		
		
		
		int count=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getExperience()>=minimumExperience) {
				count++;
			}
		}
		if (count==0) {
			return null;
		}
		
		Employee[] array=new Employee[count];
		int index=0;
		for(int i=0;i<e.length;i++) {
			if(e[i].getExperience()>=minimumExperience) {
				array[index]=e[i];
				index++;
			}
		}
		
		
		
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i].getExperience()<array[j].getExperience()) {
					Employee temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				else if(array[i].getExperience()==array[j].getExperience()) {
					if(array[i].getSalary()<array[j].getSalary()) {
						Employee temp=array[i];
						array[i]=array[j];
						array[j]=temp;
					}
					else if(array[i].getSalary() == array[j].getSalary()) {

	                    if(array[i].getEmployeeName()
	                            .compareToIgnoreCase(array[j].getEmployeeName()) > 0) {

	                        Employee temp = array[i];
	                        array[i] = array[j];
	                        array[j] = temp;
	                    }
	                }
				}
				
			}
			
		}
		return array;
		
		
		}
	
	
	
	
	
}






class Employee{
	private int employeId;
	private String employeeName;
	private String department;
	private int experience;
	private double salary;
	private double performanceRating;
	private String promotionStatus;
	
	public Employee(int employeId,String employeeName,String department,int experience,double salary,double performanceRating, String promotionStatus){
		this.employeId=employeId;
		this.employeeName=employeeName;
		this.department=department;
		this.experience=experience;
		this.salary=salary;
		this.performanceRating=performanceRating;
		this.promotionStatus=promotionStatus;
	}
	
	public int getEmployeId() {
		return employeId;
	}
	public void setEmployeId(int employeeId) {
		this.employeId=employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getPerformanceRating() {
		return performanceRating;
	}

	public void setPerformanceRating(double performanceRating) {
		this.performanceRating = performanceRating;
	}

	public String getPromotionStatus() {
		return promotionStatus;
	}

	public void setPromotionStatus(String promotionStatus) {
		this.promotionStatus = promotionStatus;
	}
	
	
}