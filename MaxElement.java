package com.day.three;

public class MaxElement {
public static void main(String[] args) {
  
    int [] arr = new int [] {5, 7, 8, 17, 23, 9};  
    int large = arr[0];
    int small = arr[0];
    for (int i = 0; i < arr.length; i++) {  
       if(arr[i] > large)  
           large = arr[i];  
    }  
    System.out.println("Largest element in array is " + large);  
    for (int i = 0; i < arr.length; i++) {  
        if(arr[i] < small)  
            small = arr[i];  
     }  
     System.out.println("Smallest element in array is " + small); 
} 
}



