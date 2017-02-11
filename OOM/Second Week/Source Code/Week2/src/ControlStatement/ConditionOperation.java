package ControlStatement;

import java.util.Scanner;

public class ConditionOperation {
	private static Scanner mScanner=null; 
	
	public static void main(String[] args) {
		mScanner=new Scanner(System.in);
		
		ifSelection();
		
	}
	private static void ifSelection()
	{
		System.out.print("Enter Two Number For if-selection : ");
		double a=mScanner.nextDouble();
		double b=mScanner.nextDouble();
		
		if(a<=b){
			System.out.println("This is if-statement = "+a+"<="+b);
		}else{
			System.out.println("This is else-statement = "+a+">"+b);
		}
		
	}
	private static void nestedIfs()
	{
		System.out.print("Enter a Number For Nested ifs : ");
		double a=mScanner.nextDouble();
		
		if(a>0){
			
			if(a<100){
				System.out.println("Ok");
			}else{
				System.out.println("Invalid Input");
			}
			
		}else{
			System.out.println("Invalid Input");
		}
		
	}
	
	private static void ifElseIfLadder()
	{
		System.out.print("Enter a Number For Nested ifs : ");
		double a=mScanner.nextDouble();
		
		if(a==0){
			System.out.println("Equal to Zero");
		
		}else if(a<0){
			System.out.println("Ok");
		
		}
		else if(a>0){
			System.out.println("Greater then Zero");
	
		}
		else{
			System.out.println("Invalid Input");
		}
		
	}
}
