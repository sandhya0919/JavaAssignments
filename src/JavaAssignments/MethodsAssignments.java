package JavaAssignments;

public class MethodsAssignments {

//Write a program to print the sum of two numbers entered by user
//by defining your own method	
	public int sum(int a,int b) {
		System.out.println("Sum of two number entered by user");
		
		return a + b;
	}
	
//Define a method that returns the product of two numbers entered by user
	
	public int product(int i, int j){
	System.out.println("Product of two numbers entered by user");
	
	return i*j;
	}


	public static void main(String[] args) {

		MethodsAssignments var1 = new MethodsAssignments();
		
		System.out.println(var1.sum(10, 20));
		
    System.out.println(var1.product(20, 40));	

	}

}
