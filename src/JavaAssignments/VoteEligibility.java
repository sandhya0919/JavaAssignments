package JavaAssignments;

public class VoteEligibility {
	
//A person is elligible to vote if his/her age is greater than or equal to 18. 
	//Define a method to find out if he/she is elligible to vote.
	
public int voteAge(int a) {
	System.out.println("Method to find out if he/she eligible to vote");
	if(a>=18) {
		System.out.println("Eligible to vote");
		 return a ;
	}else 
		System.out.println("Not eligible to vote");
	 return a ;
	}
      
	public static void main(String[] args) {
		VoteEligibility ev = new VoteEligibility();
		
		System.out.println(ev.voteAge(17));
		

	}

}
