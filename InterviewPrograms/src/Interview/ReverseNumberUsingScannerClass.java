package Interview;

import java.util.Scanner;

public class ReverseNumberUsingScannerClass {

	public static void main(String[] args) {

		
		
		int reverseNumber=0;
		
		Scanner scanner=new Scanner(System.in);
		int givenNumber=scanner.nextInt();
		
		while(givenNumber!=0) {
			reverseNumber=reverseNumber*10;
			reverseNumber=reverseNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			
		}
		System.out.println(reverseNumber);
	}

}
