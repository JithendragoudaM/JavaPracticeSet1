package practice;

import java.util.Scanner;

public class NumDiviby7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Eneter a Number:");
	int num = sc.nextInt();
	int res = num%7;
	
	String Result=res==0? num +" is divisible by 7":num +" is not divisible by 7";
	System.out.println(Result);
	
	/*if (res == 0){
		System.out.println(num +" is divisible by 7");
	}
	else {
			System.out.println(num +" is not divisible by 7");
			}
	*/
	sc.close();
}
}
