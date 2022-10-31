package com.day.three;

public class OddPosition {
	public static void main(String[] args) {
		int[] arr = new int[] {23, 25, 34, 45, 48, 67, 77, 96};
		
		System.out.println("Elements on odd position :");
		for (int i = 0;i < arr.length;i = i + 2) {
			System.out.println(arr[i]);
		}
	}
}
