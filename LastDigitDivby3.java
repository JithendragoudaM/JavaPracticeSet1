package practice;

import java.util.Scanner;

public class LastDigitDivby3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num = sc.nextInt();
	int res = num%10;
	String result = (res%3)==0?"Last digit of "+num+" is "+res+" and it is divisible by 3":"Last digit of "+num+" is "+res+" and it is not divisible by 3";
	System.out.println(result);
	sc.close();
}
}

