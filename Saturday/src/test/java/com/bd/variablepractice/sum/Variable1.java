package com.bd.variablepractice.sum;
//local variable practice

public class Variable1 {
	public void Animal() {
		int dogage;
		String dogname;
		dogage=2;
		dogname="tomy";
		System.out.println("My dog age is "+dogage+" years old.");
		System.out.println("My dog name is "+dogname+".");
		
	}
	public static void main(String[] args) {
		Variable1 d=new Variable1();
		d.Animal();
	}

}
