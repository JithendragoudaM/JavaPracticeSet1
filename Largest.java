package practice;



public class Largest {
public static void main(String[] args) {
	int[] a= {10,20,4,5,20,30};
	int largest=a[0];
	for (int i = 0; i < a.length; i++) {
		if(largest<a[i]) {
			largest=a[i];
		}
	}
	System.out.println(largest);
}
}
