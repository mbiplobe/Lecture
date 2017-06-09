package JumpStatement;

import java.util.Scanner;

public class Jump {
	private static Scanner mScanner = null;

	public static void main(String[] args) {
		mScanner = new Scanner(System.in);

	}

	private void breakStatement() {
		System.out.print("Enter a for check break statement : ");
		int a = mScanner.nextInt();

		for (int i = 0;; i++) {
			if (a == i) {
				System.out.print("Enter activated : " + i);
				break; /* break from loop */
			}
			System.out.print("Enter activated : " + i);
			continue;

		}
	}
	
	private boolean returnEvenNumber() {
		System.out.print("Enter a for check break statement : ");
		int a = mScanner.nextInt();
		boolean result;
		if(a%2==0){
			result=true;
		}else{
			result=false;
		}
		return result;
	}

}
