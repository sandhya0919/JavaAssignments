package JavaAssignments;

public class MethodsToPrintMaxAndMinNum {
//Define two methods to print the maximum and the minimum number  
	//respectively among three numbers entered by user.
	public int maximumNumber(int a,int b,int c) {
		System.out.println("Maximum number among three numbers");
		
		if(a>b && a>c) {
	 	System.out.println( a + " " +"is the greater number");
	 	return a;
		}else if (b>c) {
			System.out.println(b +"  " + "is the greater number");
			return b;
	} else
		 System.out.println(c +"  " + "is the greater number");
		return c;
		
	}
	
	
	
	public static void main(String[] args) {
		MethodsToPrintMaxAndMinNum num = new MethodsToPrintMaxAndMinNum();
		
		System.out.println(num.maximumNumber(50,60,30));
		

	}

}
