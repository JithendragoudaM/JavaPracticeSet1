package practice;

import java.util.Scanner;

public class RoadTaxCalculator {
public static void main(String[] args) {
	double RoadTax;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your Bike price: ");
	double cost=sc.nextDouble();
	if (cost<=50000) {
		RoadTax=(cost*5)/100;
		System.out.println("5% Road tax that is Rs "+RoadTax);
	}
	else if (cost>50000 & cost<=100000) {
		RoadTax=(cost*10)/100;
		System.out.println("10% Road tax that is Rs "+RoadTax);
	}
	else {
		RoadTax = (cost*15)/100;
		System.out.println("15% Road tax that is Rs "+RoadTax);
	}
	sc.close();
}
}
