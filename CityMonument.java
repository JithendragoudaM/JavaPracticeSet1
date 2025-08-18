package practice;

//import java.util.Scanner;

public class CityMonument {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		
		//System.out.println("Enter a city name");
		
		String city="Bengaluru";
		if (city == "Bengaluru")
			System.out.println("Vidhana Soudha");
		else if (city=="Tirupathi") 
			System.out.println("Vekateshwara Temple");
		else if (city == "Delhi")
			System.out.println("Red Fort");
		else if (city == "Agra")
			System.out.println("Taj Mahal");
		else if (city == "Jaipur")
			System.out.println("Jantar Mantar");
		else
			System.out.println("We dont have  "+city+" details");
		
	}
	
}
