package practice;

import java.util.Scanner;

public class EligibleForVoting {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Age:");
	int Age = sc.nextInt();
	String Result=Age<=17? "Sorry! you are not eligible for Voting":"You are eliglible for voting";
    System.out.println(Result);
    sc.close();
   }

}
