package com.day13Generics;

import java.util.Arrays;

public class Maximum<T extends Comparable<T>> {
	
	T[] arr;
	
	public void findmax() {
		Integer a = arr.length;
		T obj = arr[a - 1];
		System.out.println(obj);
	}
	
	public void sort() {
		for(T num : arr) {
			System.out.println(num);
		}
	}
	
	public void getValue(T[] arr) {
		this.arr = arr;
		maximum();
	}
	
	public<T extends Comparable<T>> void maximum() {
		Arrays.sort(arr);
		findmax();
	}
}
