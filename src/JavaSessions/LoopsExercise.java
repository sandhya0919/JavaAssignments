package JavaSessions;

public class LoopsExercise {
 
	public static void main(String[]args) {
		int i = 1;
		while(i<=10) {
		System.out.println(i);
		i++;
		}
		System.out.println("----------");
		 
		for (i=2 ; i<=10; i++) {
			if(i%2 ==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("----------");
		
		for (i=1 ; i<=10; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
	}

}
