package practice;

import java.util.Scanner;

public class GradeFinding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your marks:");
		int num = sc.nextInt();
		if (num<60) {
			System.out.println("Your grade id D");
		}
		else if(num>=60 && num<=80) {
			System.out.println("Your grade is C");
		}
		else if(num>80 && num<=90) {
			System.out.println("Your grade is B");
		}
		else
		{
			System.out.println("Your grade is A");
		}
		sc.close();
	}
}
