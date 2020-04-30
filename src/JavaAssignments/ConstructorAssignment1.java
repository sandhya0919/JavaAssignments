package JavaAssignments;

import java.util.ArrayList;

public class ConstructorAssignment1 {

	String name;
	String country;
	String establishedDate;
	ArrayList<String> courseList;
	
	public ConstructorAssignment1(String name, String country) {
		this.name = name;
		this.country = country;
	}
	public ConstructorAssignment1(String name, String country, String establishedDate, ArrayList<String> courseList) {
		
		this.name = name;
		this.country = country;
		this.establishedDate = establishedDate;
		this.courseList = courseList;
	}


	public static void main(String[] args) {
		
		
ArrayList<String>courseList = new ArrayList<String>();
courseList.add("Electrical Engineering");
courseList.add("mechanical Engineering");
courseList.add("Computer Engineering");
ConstructorAssignment1 u1 = new ConstructorAssignment1("Pavani", "London");
ConstructorAssignment1 Univer1 = new ConstructorAssignment1("Sri", "India",
"01/19/1980", courseList);

System.out.println(Univer1.name + " " + Univer1.courseList.get(0) );


	System.out.println(u1.name + " " + u1.country);
		
		
	}

}
