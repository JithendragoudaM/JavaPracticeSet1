package practice;

public class smallestOfArray_elements {
public static void main(String[] args) {
	int[] a= {10,20,4,5,20,30};
	
	int smal=a[0];
	for (int i = 0; i < a.length; i++) {
		if(smal>a[i])
		{
			smal=a[i];
		}
		
	}
	System.out.println(smal);
}
}
