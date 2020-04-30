package JavaAssignments;

public class Circle {

	public double areaOfCircle(int r) {
		System.out.println("Area of the Circle");
		double area = 22.0/7 * r * r ;
		return area;
	}
	public double circumferenceOfCircle(int r) {
		System.out.println("Circumference of the circle");
		double circumference = 2 *22.0/7 *r;
		return circumference;
	}
	public static void main(String[] args) {
	Circle  c = new Circle();
	
	System.out.println(c.areaOfCircle(10));	
	System.out.println(c.circumferenceOfCircle(10));
	}

}
