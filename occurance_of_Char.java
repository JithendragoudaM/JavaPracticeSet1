package practice;

import java.util.Scanner;

public class occurance_of_Char {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("enter the string:");
	 String str=sc.next();
	 char ta=str.charAt(1);
	 int count=0;
	 for (int i = 0; i < str.length(); i++) {
		if(str.charAt(i)==ta) {
			count++;
		}
	}
	 System.out.println(count);	 
	 sc.close();
}
}
