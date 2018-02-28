package com.tt.encapsulation;

public class Encapsulation {
	public int sum;
	public int sub;
	int mult;
	protected int div;
	public void sum(int x, int y) {
		sum =x+y;
		System.out.println("Sum is: "+sum);
		
	}
 public void subtraction (int x, int y) {
	 sub = x-y;
	 System.out.println("Subtraction is: "+sub);
	 
 }
 protected void division(int x, int y) {
	 div =x/y;
	 System.out.println("Division is: "+div);
	 
 }
 public static void main(String[] args) {
	 Encapsulation ec=new Encapsulation();
	 ec.sum(45,35);
	 ec.subtraction(45, 35);
	 ec.division(50, 10);
	 
	
}
}
