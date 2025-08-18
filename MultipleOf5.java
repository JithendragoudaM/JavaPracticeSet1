package practice;

import java.util.Scanner;



public class MultipleOf5 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	String Res=(num%5)==0?"Hello":"Bye";
	System.out.println(Res);
	sc.close();
}
}
