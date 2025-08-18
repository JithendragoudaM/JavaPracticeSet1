package practice;



class st{
	int id=105;
	static String o_name="ABC";
	static void display() {  // static method can't able to access non static variables
		
		System.out.println(o_name); // inside static method we can access only static variables
		//System.out.println(id);
		
	}
	void w() {    // non static method access static variables as well as non static variables
		System.out.println(id);
		System.out.println(o_name);
	}
}

public class Static_method_accessability {
public static void main(String[] args) {
	st.display();
	
	System.out.println();
	
	st s=new st();
	s.w();
}
}
