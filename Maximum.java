package com.day13Generics;

public class Maximum {
	String a;
	String b;
	String c;
	
	public static String maximumNumber(String a, String b, String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		String maximum = a;
		if(b.compareTo(maximum) > 0) {
			maximum = b;
		}if(c.compareTo(maximum) > 0) {
			maximum = c;
		}return maximum;
		
		
	}
	
}
