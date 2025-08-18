package practice;

import java.util.Scanner;

public class Last_Digit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	int res = num%10;
	System.out.println(res);
	sc.close();
}
}
