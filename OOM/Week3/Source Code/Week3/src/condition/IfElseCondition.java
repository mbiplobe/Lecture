package condition;
import java.util.Scanner;


public class IfElseCondition {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		float mark=scanner.nextFloat();
		
		if(mark>100 && mark<0){
			System.out.println("Please Enter a Valid Marks");
		}else if(mark>=80 && mark<=100){
			System.out.println("A+");
		}else if(mark>=70 && mark<80){
			System.out.println("A");
		}else if(mark>=60 && mark<70){
			System.out.println("A-");
		}else if(mark>=55 && mark<60){
			System.out.println("B+");
		}else if(mark>=50 && mark<55){
			System.out.println("B");
		}else if(mark>=45 && mark<50){
			System.out.println("C");
		}else if(mark>=33 && mark<45){
			System.out.println("D");
		}else{
			/*nested if else*/
			if(mark>25){
				System.out.println("Retake");
			}else{
				System.out.println("Recourse");
			}
		}
		
	}

}
