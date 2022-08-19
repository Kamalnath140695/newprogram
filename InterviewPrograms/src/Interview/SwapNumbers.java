package Interview;

public class SwapNumbers {

	public static void main(String[] args) {

		int mySalary=50;
		int thereSalary=20;
		
		System.out.println("Before Swapping:"+mySalary+"   " +thereSalary);
		
		int temp=mySalary;
		mySalary=thereSalary;
		thereSalary=temp;
		
	 System.out.println("After Swapping:"+mySalary+"  "+thereSalary);
		
	}

}
