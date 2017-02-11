package Iteration;

import java.util.Scanner;

public class JavaIteration {
	private static Scanner mScanner=null;
	
	public static void main(String[] args) {
		mScanner=new Scanner(System.in);

	}
	private static void whileLoop()
	{
		System.out.print("Enter Limit would you want to print : ");
		int limit=mScanner.nextInt();
		
		int a=1;	/* the initial value of the control variable*/
		
		while(a<=limit) /*the loop-continuation condition that determines if looping should continue.*/
		{
			System.out.println("The number is = "+a);
			a++;/*the increment (or decrement) by which the control variable is modified each
			time through the loop (also known as each iteration of the loop)*/
		}
	
	}
	private static void forLoop()
	{
		System.out.print("Enter Limit would you want to print : ");
		int limit=mScanner.nextInt();
		
		for(int a=1/*Initialization*/;a<=limit/*Condition*/;a++ /*Increment or decrement*/){
			System.out.println("The number is = "+a);
		}
	
	}
	
	private static void doWhileLoop()
	{
		System.out.print("Enter Limit would you want to print : ");
		int limit=mScanner.nextInt();
		int a=1;	/* the initial value*/
		
		do{
			a++; /*increment*/
			
		}while(a<=limit);/* Condition */
		
	}
	private static void nestedForLoop()
	{
		System.out.print("Enter Limit would you want to print : ");
		int limit=mScanner.nextInt();
		
		for(int i=0;i<limit;i++){
			for(int k=0;k<=i;k++){
				System.out.print(i+" "+k);
			}
		}
		
	}
}
