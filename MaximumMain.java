package com.day13Generics;

public class MaximumMain {
	public static void main(String[] args) {
	
	Integer [] intArray = {1, 2, 3, 4, 5};
	Double [] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};	
	String [] stringArray = {"Abhishek", "Kumar", "kanojia", "Deepti", "Virendra"};
	
	Maximum<Integer> obj1 = new Maximum<>();
	Maximum<Double> obj2 = new Maximum<>();
	Maximum<String> obj3 = new Maximum<>();

	obj1.getValue(intArray);
	obj2.getValue(doubleArray);
	obj3.getValue(stringArray);
	
	obj1.maxi();
	obj2.maxi();
	obj3.maxi();
	
	}
}
