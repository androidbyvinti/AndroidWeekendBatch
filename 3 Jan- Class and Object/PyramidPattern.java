package com.java.basicprograms;

import java.util.Scanner;

public class PyramidPattern {

	// no. of rows --> user input --> 3
	
	/*
			*	//5
		   ***  //4
		  ***** //3
		 *******
		*********
		
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no. of rows");
		int rowLength = scanner.nextInt(); //9
		
		
		for(int row = 1; row<= rowLength; row++){ //2<=5
			
			for(int space = rowLength; space>= row; space--){//5>=2
				System.out.print(" ");
			}
			for(int column = 1; column<=(2*row-1) ; column++){ //3<=2
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		

	}

}
