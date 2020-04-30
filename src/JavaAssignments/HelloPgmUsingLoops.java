package JavaAssignments;

public class HelloPgmUsingLoops {

	public static void main(String[] args) {
		String s = "Hello World";
	System.out.println("---using for loop---");	
	 for(int i=1;i<=10;i++) {
		System.out.println(s);
	}
	 
	System.out.println("---using while loop---"); 
	 int j = 1;
	 while(j<=10) {
		 System.out.println(s);
		 j++;
	 }
	 
	 System.out.println("---using do-while loop---");
	 int k = 1;
	 do {
		 System.out.println(s);
		 k++;
	 }while(k<=10);
	 }

	}


