package com.tcs.ilp;

public class Cuboid {
	
	
	private int cuboidid;
	private int length;
	private int width;
	private int height;
	static int idGenerator;
	
	public Cuboid(int length, int width, int height) {
		this.length=length;
		this.width=width;
		this.height=height;
		cuboidid=idGenerator++;
	}
	
	
	public int getCuboidid() {
		return cuboidid;
	}


	public void setCuboidid(int cuboidid) {
		this.cuboidid = cuboidid;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public static int getIdGenerator() {
		return idGenerator;
	}


	public static void setIdGenerator(int idGenerator) {
		Cuboid.idGenerator = idGenerator;
	}
	
	public double GetSurfaceArea(int length, int width, int height) {
	    return 2 * (length * width + length * height + width * height);
	}

	public double GetVolume(int length, int width, int height) {
		double VA=length*width*height;
		return VA;
	}
	
	public double GetVolume(double hollowRadius) {
		double VolSphere=(4*Math.PI* Math.pow(hollowRadius,3))/3;
		double VolCuboid=length*width*height;
		double TotalVol;
		return TotalVol=VolCuboid-VolSphere;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
