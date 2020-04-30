package JavaAssignments;

public class CricketDataStaticArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player[] p = new Player[10];
		
		Player x = new Player();
		x.name = "sreshta";
		x.age = 5;
		x.DOB = "04/19/2015";
		x.teamName = "INDIA";
		x.gender = 'f';
		x.strikeRate = 10;
		
		Player y = new Player();
		y.name = "shreyas";
		y.age = 7;
		y.DOB = "04/19/2012";
		y.teamName = "LONDON";
		y.gender = 'M';
		y.strikeRate = 15;
			
		
		p[0] = x;
		p[1] = y;
	
		
		System.out.println(p[0].teamName);
		System.out.println(p[1].name);
 
	}

}