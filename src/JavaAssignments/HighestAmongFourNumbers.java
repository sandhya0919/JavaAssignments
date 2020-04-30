package JavaAssignments;

public class HighestAmongFourNumbers {

	public static void main(String[] args){
   
		 int a = 25;
		 int b = 78;
		 int c = 87;
		 int d = 90;
		 int h;
		 if (a>b && a>c && a>d){
			
			 System.out.println("a is greatest");
		 }
		 else if(b>c && b>d) {
			 System.out.println("b is greatest");
				 }
		 else if(c>d) {
			 System.out.println("c is greatest");
		 }
		 else {
			 System.out.println("d is greatest"+ "---" + d);
		 }
}	
}