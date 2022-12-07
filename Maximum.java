package com.day13Generics;

public class Maximum<T extends Number> {
	Float a;
	Float b;
	Float c;
	
	public void maximumNumber(Float a, Float b, Float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if(a > b) {
			if(a > c) {
				System.out.println(a + "is Maximum");
			}else {
				System.out.println(c + "is Maximum");
			}
		}else if(b > c) {
			System.out.println(b + "is Maximum");
		}else {
			System.out.println(c + "is Maximum");
		}
		
		
		
	}
	
	
	
	
	
	
}
