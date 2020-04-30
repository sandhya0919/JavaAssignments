package JavaAssignments;

public class LoopsAssignment1 {
  public static void main(String[]args) {
	  String s = "I am Batman";
	  
	  System.out.println("----Using for loop---");
	  
	  for(int i=1;i<=5;i++) {
		  System.out.println(s);
		  System.out.println("   ");
	  }
	  
	  System.out.println("----Using while loop----");
	 
	  int j = 1;
	  while(j<=5) {
		  
		  System.out.println(s);
		  System.out.println("    ");
		  j++;
	  }
	  
  }
	
}
