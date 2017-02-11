package Operator;

import java.util.Scanner;

public class ArithmaticOperator {

	private static Scanner mScanner=null; 
	
	public static void main(String[] args) {
		mScanner=new Scanner(System.in);
		
		addition();
		subtraction();
		multiplication();
		division();
		modulus();
		increment();
		decrement();
	}

	private static void addition()
	{
		System.out.print("Enter Two Number For Addition Operation : ");
		double a=mScanner.nextDouble();
		double b=mScanner.nextDouble();
		
		double sum=a+b;
		
		System.out.println("The Addition of a,b is = "+sum);
	}

	private static void subtraction()
	{
		System.out.print("Enter Two Number For subtraction Operation : ");
		double a=mScanner.nextInt();
		double b=mScanner.nextInt();
		
		double subtraction=a-b;
		
		System.out.println("The Subtraction of a,b is = "+subtraction);
	}
	
	private static void multiplication()
	{
		System.out.print("Enter Two Number For multiplication Operation : ");
		double a=mScanner.nextInt();
		double b=mScanner.nextInt();
		
		double multiplication=a*b;
		
		System.out.println("The Multiplication of a,b is = "+multiplication);
	}
	private static void division()
	{
		System.out.print("Enter Two Number For Division Operation : ");
		float a=mScanner.nextFloat();
		float b=mScanner.nextFloat();
		
		if(b<=0){
			System.out.println("Arithmatic Exception");
		}
		double division=a/b;
		
		System.out.println("The Division of a,b is = "+division);
	}
	
	private static void modulus()
	{
		System.out.print("Enter Two Number For Modulus Operation : ");
		float a=mScanner.nextFloat();
		float b=mScanner.nextFloat();
		
		
		double modulus=a%b;
		
		System.out.println("The Modulus of a,b is = "+modulus);
	}
	
	private static void increment()
	{
		/*
		 *
		 * Pre-Increment : ++p;
		 * Post-Increment : p++;
		 * 
		 * */
		
		System.out.print("Enter Two Number For Increment Operation : ");
		
		int a=mScanner.nextInt();
		int b=mScanner.nextInt();
		
		int c=++a;
		
		int d=b++;
		
		
		System.out.println("The Value of = "+a);
		System.out.println("The Value of = "+b);
		System.out.println("The Value of = "+c);
		System.out.println("The Value of = "+d);
	}
	private static void decrement()
	{
		/*
		 *
		 * Pre-decrement : --p;
		 * Post-decremen : p--;
		 * 
		 * */
		
		System.out.print("Enter Two Number For Decrement Operation : ");
		
		int a=mScanner.nextInt();
		int b=mScanner.nextInt();
		
		int c=--a;
		
		int d=b--;
		
		
		System.out.println("The Value of = "+a);
		System.out.println("The Value of = "+b);
		System.out.println("The Value of = "+c);
		System.out.println("The Value of = "+d);
	}

}
