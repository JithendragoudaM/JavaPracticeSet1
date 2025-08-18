package practice;

import java.util.Scanner;

public class Electricity_Bill_Calculation {
public static void main(String[] args) {
	double Charge;
	double Charge1;
	double Charge2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Units used");
	double units = sc.nextDouble();
	if (units <=100) {
		System.out.println("No Charge");
	}
	else if(units >100 & units <=200) {
		Charge = (units-100)*5;
		System.out.println("Pay Rs "+Charge);
	}
	else if(units>200){
		//*Charge = ((units-(units-100))*10)+((units-(units-200))*5);  X
		 Charge1 = (units-200)*10;
		 Charge2 = 100*5;
		 Charge = Charge1+Charge2;
		
		System.out.println("Pay Rs "+Charge);
		sc.close();
	}
}
}
