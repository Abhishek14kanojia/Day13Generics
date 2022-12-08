package com.day13Generics;

public class MaximumMain {
	public static void main(String[] args) {
	
		Integer a = 50 , b = 100, c = 125;
		int maxInt = new Maximum<Integer>(a, b, c).maximum();
		System.out.println("Maximum is : " + maxInt);
	
		Double a1 = 50.50, b1 = 100.50, c1 = 125.24;
		double maxDouble = new Maximum<Double>(a1, b1, c1).maximum();
		System.out.println("Maximum is : " + maxDouble);
		
		String a2 = "Abhishek", b2 = "Kumar", c2 = "Kanojia";
		String maxString = new Maximum<String>(a2, b2, c2).maximum();
		System.out.println("Maximum is : " + maxString);
		
		
	}
}
