package com.syntax.GroupProject;

public class Task08 {

	public static void main(String[] args) {
			
		//Write a Java Program to print the first 10 numbers of Fibonacci series.
		
		int number=10; int firstNum=0;int secondNum=1;
		
		for (int i = 0; i <= number; ++i) {
		      System.out.print(firstNum + " ");
		      
		      int thirdNum = firstNum + secondNum;
		      firstNum = secondNum;
		      secondNum = thirdNum;
		      }
		
	}

}
