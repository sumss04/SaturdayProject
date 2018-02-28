package com.bd.variablepractice.sum;

public class Constractor1 {
	 
	int a;
	 int b;
	 
	 Constractor1(){
		 a=10;
		 b=20; 
	 }
	 
	public static void main(String[] args) {
		int x;
		 Constractor1 c=new  Constractor1();
		 x=c.a*c.b;
		 System.out.println(x);	 
	}

}
