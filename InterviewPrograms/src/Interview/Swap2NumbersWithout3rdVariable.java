package Interview;

public class Swap2NumbersWithout3rdVariable {

	public static void main(String[] args) {

		int first=50;
		int second=30;
//		
		System.out.println("Before swapping:"+first+" "+second);
//		first=first-second;
//		second=first+second;
//		first=second-first;
//		
//		System.out.println("After swapping"+first+"  "+second);
//		
	first=first*second;
	second=first/second;
	first=first/second;
	
	System.out.println("After swapping"+first+" "+second);
		
	}
	
	

}
