package com.usa.opps.sum;

public class Abstract2Demo1 extends Abstract2Demo{

	@Override
	public void display3() {
	System.out.println("Bangleadesh");
		
	}

	@Override
	public void display1() {
	System.out.println("USA");
		
	}

	public static void main(String[] args) {
		display2();
		
		Abstract2Demo1 s=new Abstract2Demo1();
		s.display1();
		s.display3();
		math();
	}
}