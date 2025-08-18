package practice;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Year:");
	int year = sc.nextInt();
	String leapyear=year%4==0?year+" is a leap year":year+" is not a leap year";
	System.out.println(leapyear);
	sc.close();
}
}
