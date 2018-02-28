package com.bd.variablepractice.sum;

public class Constractor {
	static int a=50;
	static int b=20;
		int c;
		int d;
	
	Constractor(){
		c=100;
		d=50;
		
	}

public static void main(String[] args) {
	int x;
	Constractor obj=new Constractor();
	
	// c and d are instance variable, to access those variables inside 
	//the main method we need to create object reference.
	
	x=obj.c*obj.d;
	int z=a+b;
	
	System.out.println(x);
	System.out.println(z);
}

}
