package com.selection.main;

import java.util.Arrays;

public class SelectionSortEx {

	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int length = arr.length;
		
		int min=0;
		int temp =0;
		
		for(int i = 0;i<length;i++)
		{
			min = i;
			for(int j=i+1;j<length;j++)
			{
				if(arr[j]<arr[min])
				{
					min = arr[j];
				}
			}
			
			temp = arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
		

	}

}
