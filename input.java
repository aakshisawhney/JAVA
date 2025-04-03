package input;
import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sub1 marks :- ");
		float a = sc.nextFloat();
		System.out.println("Enter sub2 marks:- ");
		float b = sc.nextFloat();
		System.out.println("Enter sub3 marks:- ");
		float c = sc.nextFloat();
		System.out.println("Enter sub4 marks:- ");
		float d = sc.nextFloat();
		System.out.println("Enter sub5 marks:- ");
		float e = sc.nextFloat();
		
		float percentage = (a+b+c+d+e)*100 / 500;
		System.out.println("Sum of these numbers is :- ");
		System.out.println(percentage);
		
          
		
		
		
	}

}
