package JavaAssignments;

public class StaticDataCricketData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object P1[]= new Object[6];
		   P1[0] = "Sam";
           P1[1]=  25;
           P1[2] = "India";
           P1[3] = "2/10/1995";
           P1[4] = 'M';
           P1[5] = 10;
           
           Object P2[]= new Object[6];
		   P2[0] = "Ram";
           P2[1]=  25;
           P2[2] = "India";
           P2[3] = "2/10/1995";
           P2[4] = 'M';
           P2[5] = 15;
           
           for(int i=0;i<P1.length;i++) {
        	   System.out.println(P1[i]);
           }
           for(int j=0;j<P2.length;j++) {
        	   System.out.println(P2[j]);
           }
           
//           Object Players[] = new Object[2];
//           Players[0] = P1;
//           Players[1] = P2;
//           
//           for(int j=0;j<Players.length;j++){
//        	   for(int i=0;i< ((Object[])Players[j]).length;i++) {
//       	   System.out.println(((Object[])Players[j])[i]);
//           
           
           
	}

}
