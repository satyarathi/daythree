package com.day.three;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println("Reverse of the Element is :");
		for(int i =arr.length-1;i>= 0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}