package practice;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Enter a number between 1 to 12:");
		int month=sc.nextInt();
		switch (month){
		case 1:
			System.out.println("January month and number of days are 31");
			break;
		case 2:
			System.out.println("February month and number of days are 28 and for the leap year it is 29 days");
			break;
		case 3:
			System.out.println("March month and number of days are 31");
			break;
		case 4:
			System.out.println("April month and number of days are 30");
			break;
		case 5:
			System.out.println("May month and number of days are 31");
			break;
		case 6:
			System.out.println("June month and number of days are 30");
			break;
		case 7:
			System.out.println("July month and number of days are 31");
			break;
		case 8:
			System.out.println("August month and number of days are 31");
			break;
		case 9:
			System.out.println("September month and number of days are 30");
			break;
		case 10:
			System.out.println("October month and number of days are 31");
			break;
		case 11:
			System.out.println("November month and number of days are 30");
			break;
		case 12:
			System.out.println("December month and number of days are 31");
			break;
		default :
			System.out.println("You have entered a wrong number, plesae check");
			break;
		}
		sc.close();
	}
}
