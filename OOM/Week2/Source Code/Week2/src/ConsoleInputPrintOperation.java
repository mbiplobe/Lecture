import java.util.Scanner;

public class ConsoleInputPrintOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Byte Number

		System.out.println("Enter Byte Number : ");
		byte byteNumber = sc.nextByte();
		System.out.println("Byte Number : "+byteNumber);

//		Short Number
		System.out.println("Enter Short Number : ");
		short shortNumber = sc.nextShort();
		System.out.println("Short Number : "+shortNumber);
		
//		Int Number
		System.out.println("Enter Integer Number : ");
		int intNumber = sc.nextInt();
		System.out.println("Integer Number : "+intNumber);
		
//		Long Number
		System.out.println("Enter Long Number : ");
		long longNumber = sc.nextLong();
		System.out.println("Long Number : "+longNumber);
		
//		Float Number
		System.out.println("Enter Floar Number : ");
		float floatNumber = sc.nextFloat();
		System.out.println("float Number : "+floatNumber);
		
//		Double Number
		System.out.println("Enter Double Number : ");
		double doubleNumber = sc.nextDouble();
		System.out.println("double Number : "+doubleNumber);
		
//		String Number without white space
		System.out.println("Enter String Without White Space : ");
		String stringNumber = sc.next();
		System.out.println("String Number : "+stringNumber);
		
//		String Number with whitespace 
		System.out.println("Enter String Without White Space : ");
		String stringWithWhitespaceNumber = sc.nextLine();
		System.out.println("Number with  with WhiteSpace: "+stringWithWhitespaceNumber);
	}

}
