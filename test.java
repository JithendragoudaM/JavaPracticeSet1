package practice;

import java.util.Scanner;

class choice1{
	Scanner sc=new Scanner(System.in);
	void choose() {
		System.out.println("Please enter your choice");
		int ch=sc.nextInt();
		switch(ch){
				case 1:{
						System.out.println("Check Balance.");
						break;
				}
				case 2:{
						System.out.println("Show active data plan.");
						break;
				}
				case 3:{
						System.out.println("Recharge");
						break;
				}
				case 0:{
						System.out.println("Exit");
						return;
						
				}
				default:{
						System.out.println("Invalid Input, plesae try agin");
						break;
				}
		
		}
		
	}
}
class choice2 extends choice1{
	
	void choices() {
	System.out.println("Please enter your choice");
	int ch=sc.nextInt();
	switch(ch) {
		case 1:{
				System.out.println("Data plans");
				break;
		}
		case 2:{
				System.out.println("Talktime");
				break;
		}
		case 3:{
				System.out.println("Special plans");
				break;
		}
		case 0:{
				System.out.println("Go to previous menu");
				choose();
				break;
		
		}
		default:{
				System.out.println("Invalid Input, plesae try again");
				break;
		
		}
	}

}

}
public class test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please press 1 for to know current using plans or press 2 for know the plans ");
		int choice=sc.nextInt();
		choice1 ch1=new choice1();
		choice2 ch2=new choice2();
		if (choice==1) {
			ch1.choose();
		}
		else if(choice==2) {
			ch2.choices();
		}
		else {
			System.out.println("Invalid Input, plesae try agian");
		}
		sc.close();
}
}

