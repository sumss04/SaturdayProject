package com.usa.opps.sum;

public abstract class Animal {
	public static void dog() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("The sum of the given number is: "+sum);
	}
	public static void cat() {
		System.out.println("Cats are good to hunting");
	}
	public abstract void cow();

}
