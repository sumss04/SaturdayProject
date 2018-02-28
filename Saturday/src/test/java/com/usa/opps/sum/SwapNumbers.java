package com.usa.opps.sum;

public class SwapNumbers {
	int s;
	int t;
	public static void swap(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}
	public static void swap(SwapNumbers p) {
		int temp=p.s;
		p.s=p.t;
		p.t=temp;
		
	}

	public static void main(String[] args) {
		
		SwapNumbers sw=new SwapNumbers();
		sw.s=50;
		sw.t=100;
	
		swap(sw.s,sw.t);
		System.out.println("Pass by values s is "+sw.s);
		System.out.println("Pass by values t is "+sw.t);
		swap(sw);
		System.out.println("Pass by reference s is: "+sw.s);
		System.out.println("Pass by reference t is: "+sw.t);
	}

}
