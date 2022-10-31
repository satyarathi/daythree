package com.day.three;

public class DuplicateElement {
public static void main(String[] args) {
	String[] arr = {"Rahul","Amar","Vikram","Vedha","Amar","Rahul"};
	for(int i = 0; i < arr.length-1; i++)
    {
        for (int j = i+1; j < arr.length; j++)
        {
            if (arr[i] == arr[j] )
            {
                System.out.println("Duplicate Element : "+arr[j]);
            }
        }
    }
}    
}


