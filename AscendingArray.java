package com.day.three;

public class AscendingArray {
	public static void main(String[] args) {
		int [] arr = new int [] {6,1,3,5,9,2,4};
		int num = 0;

		for (int i = 0;i < arr.length;i++) {
			for(int j = i+1;j < arr.length; j++) {
				if (arr[i]>arr[j])
				{
					num = arr[i]; //6//1
					arr[i] = arr[j];//1
					arr[j] = num;//6
				}
			}
		}
		System.out.println("Ascending order :");
		for (int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
