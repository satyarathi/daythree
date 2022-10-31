package com.day.three;

public class SecondLargest {

	public static void main(String[] args) {

		int [] arr = new int [] {5, 8, 17, 23, 9,67};  
		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {  
			if(arr[i] > large)  
				large = arr[i-1];  
		}  
	    System.out.println("Largest element in array is " + large);  
	}
}
