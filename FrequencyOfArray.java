package com.day.three;

import java.util.Scanner;

public class FrequencyOfArray {
	public static void main(String[] args) {
		int[] arr = new int[] {2,4,3,2,9,8,5,3,3,8,3,9,7};
		int[]next = new int[arr.length];
		int counted = -1;
		for(int i = 0;i <arr.length;i++)
		{
			int count = 1;
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j]) {
					count++;
					next[j] = counted;
				}
			}
			if(next[i] != counted)
			{ 
				next[i] = count;
			}
		}
		System.out.println("Element  Frequency");
		for(int i = 0; i < next.length; i++){
			if(next[i] != counted)
				System.out.println(arr[i] + "          " + next[i]);
		} 
	}
}



