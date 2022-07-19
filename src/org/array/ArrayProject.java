package org.array;

public class ArrayProject {
	
	//datatype variablename[]=new datatype[size]
	
	public static void main(String[] args) {
		
	
	int a[]=new int[8];{
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=90;
	a[4]=10;
	a[5]=10;
	a[6]=40;
	a[7]=50;
	
	
	System.out.println(a);
	
	//getparticular value
	System.out.println(a[4]);
			
	System.out.println("normal for loop");
	
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	}
}
}