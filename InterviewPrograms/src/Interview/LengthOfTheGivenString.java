package Interview;

public class LengthOfTheGivenString {

	public static void main(String[] args) {

		String givenName="Kamalnath";
		System.out.println(givenName.length());
		
		System.out.println("**********");
		
		char[] charArray=givenName.toCharArray();
		int length=0;
		
		for(char c:charArray) {
			length++;
		}
		System.out.println(length);
	}

}
