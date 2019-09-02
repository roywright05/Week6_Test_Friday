package com.test.question1;

import java.util.Random;

public class ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randNum = new Random();
		
		int arr1 [] = new int[15];
		int arr2 [] = new int [10];
		
		for(int i = 0; i < 15; i++) {
			
			arr1[i] = randNum.nextInt(100);
		}
		
		for(int j = 0; j < 10; j++) {
			
			arr2[j] = randNum.nextInt(100);
		}
		
		System.out.println("The value is: \t" + findValue(arr1, 14));
		System.out.println("The value is: \t" + findValue(arr2, 14));
		
		

	}
	
	public static int findValue(int array [], int target) {
		
		bubbleSort(array, array.length);
		
		if(array.length > target) {
			
			return array[target];
		}else {
		
		return -1;
		}
	}
	
	public static void bubbleSort(int [] array, int length) {
		
		int temp;
		
		
			for(int i=0; i<array.length; i++) {
				
				boolean flag = false;
				
				for(int j = 0; j<array.length-1-i; j++) {
					
					if(array[j]>array[j+1]) {
						
						temp=array[j];
						array[j]= array[j+1];
						array[j+1]=temp;
						flag=true;
					}
					
					
				}//End second for loop
					
					if(!flag) {
						
						break;
					}
					
			}//End first for loop
						
				
			for(int i = 0; i < array.length; i++) {
				
				System.out.print(array[i] + " ");
			}
			System.out.println();
		
	}//end method

}
