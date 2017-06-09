package loop;

import java.util.Scanner;

public class WhileLoop {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter Student Number Would You calculate Result : ");
		int studentNumber=scanner.nextInt();
		int i=1;
	
		while(i<=studentNumber){
			System.out.println("Student Number :"+i);
			getResult();
			i++;
		}
	}
	
	private static String getGrade(float mark) {


		String grade = "";
		if (mark > 100 && mark < 0) {
			grade = "I";
		} else if (mark >= 80 && mark <= 100) {
			grade = "A+";

		} else if (mark >= 70 && mark < 80) {
			grade = "A";

		} else if (mark >= 60 && mark < 70) {
			grade = "A-";

		} else if (mark >= 55 && mark < 60) {
			grade = "B+";

		} else if (mark >= 50 && mark < 55) {
			grade = "B";

		} else if (mark >= 45 && mark < 50) {
			grade = "C";

		} else if (mark >= 33 && mark < 45) {
			grade = "D";

		} else {
			/* nested if else */
			if (mark > 25) {
				grade = "Retake";

			} else {
				grade = "Recourse";

			}
		}

		return grade;
	}

	private static String getDivision(float mark) {
		String division = "";
		if (mark > 100 && mark < 0) {
			division = "I";
		} else if (mark >= 60 && mark <= 100) {
			division = "First Class";

		} else if (mark >=45 && mark < 60) {
			division = "Second Class";

		} else if (mark >= 33 && mark < 45) {
			division = "Third Class";
		}else{
			division = "Fail";
		}

		return division;
	}
	
	private static void printResult(int scale,String result){
		System.out.println("Scale :"+ scale);
		
		System.out.println("Result :"+ result);
		
	}

	private static void getResult(){
		System.out.println("Enter CGPA Scale : ");
		int scale = scanner.nextInt();

		System.out.println("Enter Obtain Mark : ");
		float marks = scanner.nextFloat();
		
		String result="";

		switch (scale) {

		case 4:
			result=getGrade(marks);
			break;
		case 5:
			result=getGrade(marks);
			break;

		default:
			result=getDivision(marks);
			break;
		}
		
		printResult(scale,result);
	}

}
