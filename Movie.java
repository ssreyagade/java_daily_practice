package com.tcs.ilp;

import java.util.*;
import java.util.*; 

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Movie[] must=new Movie[4];
		for(int i=0;i<must.length;i++) {
			
			String a=sc.nextLine();
			String b=sc.nextLine();
			String c=sc.nextLine();
			int d=sc.nextInt();
			sc.nextLine();
			
			must[i]=new Movie(a,b,c,d);
		}
		String genre=sc.nextLine();
		String[] res= getMovieByGenre(must,genre);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}

	}
	
	
	// static 
	public static String[] getMovieByGenre(Movie[] m, String genre) {
		String[] arr2=new String[0];
		
		for (int i=0;i<m.length;i++) {
			if(m[i].getGenre().equalsIgnoreCase(genre)) {
				if(m[i].getBudget()>800000000) {
					arr2=Arrays.copyOf(arr2, arr2.length+1);
					arr2[arr2.length-1]="High Budget Movie";
				}
				else {
					arr2=Arrays.copyOf(arr2, arr2.length+1);
					arr2[arr2.length-1]="Low Budget Movie";
				}
			}
		}return arr2;
		
		}
	
	
}


class Movie{
	private String movieName;
	private String company;
	private String genre;
	private int budget;
	
	public Movie(String movieName, String company, String genre, int budget) {
		super();
		this.movieName = movieName;
		this.company = company;
		this.genre = genre;
		this.budget = budget;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	
	
}