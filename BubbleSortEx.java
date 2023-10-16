package com.bubblesort.main;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortEx {

	public static void main(String[] args) {
		
		int[] arr = {5,4,3,2,1};
		int length = arr.length;
		
		
		
		for(int i=0 ; i<length ; i++)
		{
			for(int j=0; j<length-1-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
			
			
			
		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
