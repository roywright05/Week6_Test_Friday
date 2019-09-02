package com.test.question3;

public class Duplicates {

	public static void main(String[] args) {
		
			

	}
	
	public static int [] removeDuplicates(int [] array) {
		
		bubbleSort(array, array.length);
		
		int updatedArray [];
		
		int duplicateCount = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = i++; j < array.length; j++) {
				
				if(array[i] == array[j]) {
					
					duplicateCount++;
				}
				
				
			}
		}
		
		updatedArray = new int [array.length - duplicateCount];
		
		for (int i = 0; i < updatedArray.length; i++) {
			
		}
		
		return updatedArray;
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
		
	}

}
