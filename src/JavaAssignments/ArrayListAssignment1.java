package JavaAssignments;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
//  Write a Java program to create a new array list, add some colors (string) and print out the collection

		ArrayList a = new ArrayList();
		
		a.add("PINK");
		a.add("BLUE");
		a.add("PURPLE");
		a.add("RED");
		a.add("GREEN");
		System.out.println(a);
		System.out.println("----------");
		
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	System.out.println("-------------------");	
	
//Write a Java program to retrieve an element (at a specified index) from a given array list.
	
	System.out.println(a.get(1));
	
	System.out.println("--------------------");

//Write a Java program to update specific array element by given element.
	
	a.set(1, "MAGENTA");
	
	for(int k=0;k<a.size();k++) {
	
	System.out.println(a.get(k));
	}
	
	System.out.println("--------------------");
	
//Write a Java program to remove the third element from a array list
	
	a.remove(3);
	System.out.println(a.size());
	
	for(int k=0;k<a.size();k++) {
		
		System.out.println(a.get(k));
		}
	System.out.println("------------------");

//Write a Java program to search an element in a array list.
			
		if(a.contains("MAGENTA")) 
			System.out.println("Element MAGENTA found in array list");
			
		else
		System.out.println("Element not found in array list");
		
			System.out.println("-------------------");
			
//Write a Java Program to sort elements in a array list.
		
		Collections.sort(a);
		for(int z=0;z<a.size();z++) {
			System.out.println(a.get(z));
		}
	}
	
	
	}


