package com.insertion.main;

import java.util.Arrays;

public class InsertionEx {

	public static void main(String[] args) {
		int[] arr = {8,5,4,6,7,3};
		
		int j=0;
		int temp = 0;
		
		
		for(int i =1;i<arr.length;i++)
		{
			temp = arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp)
			{
				arr[j] = arr[j-1];
				j=j-1;
				
			}
			arr[j] = temp;
		}	
		
		System.out.println(Arrays.toString(arr));
		

	}

}
