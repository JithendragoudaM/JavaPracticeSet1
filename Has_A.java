package practice;

class h{
	int id;
	String name;
	h(int i, String na){
		this.id=i;
		this.name=na;
	}
}
class a{
	h H;
	int age;
	void display(int age, h H) {
		System.out.println("Id: "+H.id);
		System.out.println("Name: "+H.name);		
		System.out.println("Age:"+ age);
	}
}
class a1{
	h K;
	void display(int age, h K) {
		System.out.println("Id: "+K.id);
		System.out.println("Name: "+K.name);		
		System.out.println("Age:"+ age);	
	}
}

public class Has_A {
public static void main(String[] args) {
	a s=new a();
	h H = new h(12, "Radhe");
	s.display(20, H);
	System.out.println();
	a1 a=new a1();
	h K=new h(13, "Krishna");
	a.display(25,K);
}
}
