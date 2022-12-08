package com.day13Generics;

import java.util.Arrays;

public class Maximum<T extends Comparable<T>> {
	
	T[] arr;
	
	public void maxi() {
		Integer a = arr.length;
		T obj = arr[a - 1];
		System.out.println(obj);
	}
	
	public void getValue(T[] arr) {
		this.arr = arr;
		maxi();
	}
	
	public<T extends Comparable<T>> void maximum() {
		Arrays.sort(arr);
	}
}
