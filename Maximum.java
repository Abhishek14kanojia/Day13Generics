package com.day13Generics;

public class Maximum<T extends Comparable<T>> {
	T a;
	T b;
	T c;
	
	
	public Maximum(T a, T b, T c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T maximum() {
		return Maximum.maximumNumber(a, b, c);
	}


	public static<T extends Comparable<T>> T maximumNumber(T a, T b, T c){
		{
			T max = a;
			if(b.compareTo(max) > 0) {
				max = b;
			}if(c.compareTo(max) > 0) {
				max = c;
			}
			return max;
		}
	}		
}
