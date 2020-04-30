package JavaAssignments;

public class A {
	
	public static int multiply(int multiplicand, int multiplier) {
		return multiplicand * multiplier;
	}
	
	public static void main(String[] args) {
		
		int salary = 3000;
		int months =12;
		
		int annualSalary = A.multiply(salary,months);
		
		System.out.println("annual salary = " + annualSalary);

		int hourlyRate = 60;
		int hours = 40;
		int weeklyPay = multiply(hourlyRate, hours);
		
		System.out.println("weekly Pay =" + weeklyPay);
		
		System.out.println("some multiplication = " + multiply(12, 5));
	}

}
