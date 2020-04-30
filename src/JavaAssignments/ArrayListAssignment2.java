package JavaAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment2 {

	public static void main(String[] args) {
		//  Write a Java program to reverse elements in a array list
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(300);
		ar.add(400);
// To get the last element from array list
		
	//	System.out.println(ar.get(ar.size()-1));
		
		Collections.reverse(ar);
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	
		System.out.println("------------");
	// Write a Java program to trim the virtual capacity of an array 
		//list the current list size.
		
      ar.trimToSize();
      System.out.println("size of array" + "====" + ar.size());
      
      System.out.println("------------");
  //Write a Java program to print all the elements of a ArrayList 
   //using the position of the elements 
      
      for(int j=0;j<ar.size();j++) {
    	  System.out.println(ar.get(j));
      }
      
  System.out.println("--Insert elements at first and last positions---");
 //Write a Java program to insert an element into the array list at the
      //first and last positions.     
      
      ar.add(0,750);
      ar.add(ar.size(),550);
      for(int k=0;k<ar.size();k++) {
    	  System.out.println(ar.get(k));
      }
      System.out.println("-----swap 2 elements------");
 //Write a Java program of swap two elements in an array list. 
      
      Collections.swap(ar, 0,1);
      
     for(int k=0;k<ar.size();k++) {
    	  System.out.println(ar.get(k));
    	  
    	      }
     
  
     System.out.println("---extract portion from array list"); 
   
 //Write a Java program to extract a portion of a array list.    
     List<Integer> list = ar.subList(1, 4);
     System.out.println("SubList stored in List: "+ list);
   
     
     
     System.out.println("----empty array list----");
      //Write a Java program to empty an array list.
      
     // ar.clear();
      ar.removeAll(ar);
      
      System.out.println(ar);
	}

}
