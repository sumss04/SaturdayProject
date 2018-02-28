package com.usa.opps.sum;

public class My_Calculation extends Calculation{
	 void division(int x, int y) {
		int z=x/y;
		System.out.println("The division between the given numbers:"+z);
		
	}

	public static void main(String[] args) {
	
		My_Calculation demo=new My_Calculation();
		demo.addition(30, 10);
		demo.subtruction(50, 20);
		demo.multiplication(10, 20);
		demo.division(100, 20);

	}

}
