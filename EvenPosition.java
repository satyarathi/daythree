package com.day.three;

public class EvenPosition {
public static void main(String[] args) {
	int[] arr = new int[] {23, 25, 34, 45, 48, 67, 77, 96};
	
	System.out.println("Elements on even position :");
	for (int i = 1;i < arr.length;i = i + 2) {
		System.out.println(arr[i]);
	}
}
}
