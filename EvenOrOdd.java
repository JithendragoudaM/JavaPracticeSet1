package practice;

import java.util.Scanner;

public class EvenOrOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter a number:");
	int num = sc.nextInt();
	String Res =(num%2)==0?num +" is an even number":num+" is an odd number";
	System.out.println(Res);
	sc.close();
}
}
