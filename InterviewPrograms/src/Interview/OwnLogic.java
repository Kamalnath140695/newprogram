package Interview;

/*public class ReverseASTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given="Agni";
		
		StringBuffer buffer=new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());

	}*/


public class OwnLogic{
	
	public static void main(String[] args) {
		String given="Agni";		
		
		char[] CharacterArray=given.toCharArray();
	String reversed="";
		for(int i=CharacterArray.length-1;i>=0;i--) {
				reversed=reversed+CharacterArray[i];
				System.out.print(reversed);
		}
	}
	
}

