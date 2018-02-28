package com.tt.encapsulation;

public class Encap4 extends Encapsulation {
	public void subtraction (int x, int y) {
		 sub = x-y;
		 System.out.println("Subtraction is: "+sub);}

	public static void main(String[] args) {
		Encap4 ec=new Encap4();
		ec.subtraction(100, 20);
		ec.division(20, 10);

	}

}
