package practice;

class hello {
	void dis() {
		System.out.println("HI");
	}
}

class l extends hello {
	void dis() {
		System.out.println("Hello");
		super.dis();
	}
}

public class poly {
public static void main(String[] args) {
	
	l obj = new l();
	obj.dis();
	
	
}
}
