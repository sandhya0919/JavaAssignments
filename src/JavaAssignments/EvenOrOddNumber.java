package JavaAssignments;

public class EvenOrOddNumber {
	//Define a program to find out whether a given number is even or odd.
	public int  evenOdd(int a) {
		System.out.println("Given number is even or odd");
		
		if(a%2 == 0) {
			System.out.println("Even Number");
		}else
			System.out.println("Odd Number");
	
	 return a;
	}
	
	public static void main(String[] args) {
		EvenOrOddNumber num = new EvenOrOddNumber();
		System.out.println(num.evenOdd(3));

	}

}
