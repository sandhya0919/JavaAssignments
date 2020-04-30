package JavaSessions;

public class DataTypesAssignment {

	public static void main (String args[]) {	
	String var1 = "Hello";
	String var2 = "Naveen K";
	System.out.println(var1);
	System.out.println(var2);

	Boolean flag = false;
	if( ! flag == true) {
		System.out.println("say hello");
	}
	else {
		System.out.println("say bye");
	}
	
	String s = (var1.equalsIgnoreCase("hello")) ? "hi" : "Bye";
	System.out.println(s);
	
	String name = "sri";
	if(!name.equals("")) {
		System.out.println("name");
	}
	else {
		System.out.println("name is blank");
	}
		
	}
}
