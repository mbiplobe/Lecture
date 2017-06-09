package string;

import java.util.Scanner;

public class StringData {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String name=new String();
		System.out.println("Enter Your Name : ");
		name=scanner.nextLine();
		
		System.out.println("Your Name : ");
		
		System.out.println("Length : "+name.length());
		
		

	}

}
