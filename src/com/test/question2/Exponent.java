package com.test.question2;

public class Exponent {

	public static void main(String[] args) {
		
//		int m = -3;
//		
		System.out.println(1/8);
		String value = exponentialValue(2, -3);
		
		System.out.println("The value is: " + value);
	}
	
	
	public static String exponentialValue(int n, int m) {
		Integer solution = new Integer(1);
		//int array [] = new int [m];
		if (n == 0 && m != 0) {
			
			return "0";
		}else if(m == 0 && n != 0) {
			
			return "1";
			
		}else if(m < 0 && n > 0) {
			int val = -m;
			
			for(int i = 0; i < val; i++) {
				
				solution *= n;
			}
			
			return ("1 / " + solution.toString());
			
		}else {
			
			for(int i = 0; i < m; i++) {
				
				solution *= n;
			}return solution.toString();
		}
		
		
		
	}

}
