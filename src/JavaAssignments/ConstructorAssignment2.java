package JavaAssignments;

import java.util.ArrayList;

public class ConstructorAssignment2 {
  String browserName;
  String vendorName;
 Double currentVersion;
 ArrayList<String> Plugins; 
 
 public ConstructorAssignment2(String browserName, String vendorName) {
	 this.browserName = browserName;
	 this.vendorName = vendorName;
	 
 }

	public ConstructorAssignment2(String browserName, String vendorName, Double currentVersion, ArrayList<String> plugins) {

	this.browserName = browserName;
	this.vendorName = vendorName;
	this.currentVersion = currentVersion;
	this.Plugins = plugins;
}

	public static void main(String[] args) {
		ArrayList<String> p = new ArrayList<String>();
		p.add("firebug");
		p.add("adobe photohop");
			
		
		ConstructorAssignment2 c1 = new ConstructorAssignment2("chrome", "Google");
System.out.println(c1.browserName + " " + c1.vendorName);
	}

}
