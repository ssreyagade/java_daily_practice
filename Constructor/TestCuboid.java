package com.tcs.ilp;

public class TestCuboid {
	
	public static void finalCubiodMaxVolume(Cuboid c1,Cuboid c2,Cuboid c3) {
		
		
		double v1=c1.GetVolume(c1.getLength(), c1.getWidth(), c1.getHeight());
		double v2=c1.GetVolume(c2.getLength(), c2.getWidth(), c2.getHeight());
		double v3=c1.GetVolume(c3.getLength(), c3.getWidth(), c3.getHeight());
		
		if (v1 > v2 && v1 > v3) {
            System.out.println("C1 has highest volume");
        }
        else if (v2 > v1 && v2 > v3) {
            System.out.println("C2 has highest volume");
        }
        else {
            System.out.println("C3 has highest volume");
        }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuboid c1=new Cuboid(12,21,2);
		Cuboid c2=new Cuboid(12,100,2);
		Cuboid c3=new Cuboid(12,6,2);
		
		finalCubiodMaxVolume(c1, c2, c3);

	}

}
