package JavaStrings;

public class ReverseString {
	
	public String revString(String str) {
		String rev = "";
		if(str.length()==0) 
			return " ";		
		for (int i= str.length()-1;i>=0;i--) {
			rev = rev + str.charAt(i);
		}
	//	System.out.println(rev);	
		return rev;
	}
	
	public static void main(String[] args) {
		ReverseString s = new ReverseString();
	String x=	s.revString("ab");
		System.out.println(x);
		
		String str = "Sandhya";
		String rev = "";
		
		for (int i = str.length()-1;i>=0;i--) {
			
			rev = rev + str.charAt(i);
		}
		
		System.out.println(rev);
		
	String s1 = "  sreshta    ";
	 System.out.println(s1.charAt(1));
	 System.out.println(s1.contains("e"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.trim());
		String	s2 = s1.trim();
		System.out.println(s1.replace("sreshta", "shreyas"));
	System.out.println(s2.length());
		System.out.println(s1.indexOf("s"));
	}

}
