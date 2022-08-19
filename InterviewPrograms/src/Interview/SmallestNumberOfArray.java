package Interview;

public class SmallestNumberOfArray {

	int givenArray[]= {2,5,7,5,3};
	
	public void findSmallest() {
		int smallest=Integer.MAX_VALUE;
		
		for(int i = 0;i<givenArray.length;i++) {
			
			smallest=givenArray[i];
			
			
		}
		System.out.println("smallest number is"+smallest);
	}
	
	public static void main(String[] args) {
		
		SmallestNumberOfArray smallest1=new SmallestNumberOfArray();
		smallest1.findSmallest();
	
	}
	

}
