package starPackage1;

public class StarAssignment12345
{
 public static void main(String[] args) 
 {
	 		//  star program 1
	 
	 for (int i=1;i<=5;i++)
	{
		{
	//	System.out.print(i);
	}
		for (int j=1;j<=5;j++)
		{
			System.out.print("*");
		}
		
		System.out.println();	
	}

	
	      // star program 2
		 for (int i=5;i>=1;i--)
		 {  
		 for (int j=5;j>=i;j--)
		 {
			 System.out.print("*");
		 }
		 
			 System.out.println(); 
		 }
		 
//	 Star program 3 
	 
	 for (int i=1;i<=5;i++)
	 {
		 for (int j=5;j>=i;j--)
		 {
			 System.out.print("*");
			 
		 }
	          System.out.println();
	
	 }
//		Star program 4
	 
	 for (int i=1;i<=4;i++)
	 {
		 for (int j=1;j<=i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	     for (int i=1;i<=5;i++)
	     {
	    	 for(int j=5;j>=i;j--)
	    	 {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }

	 
//	  Star program 5
	 
	 for (int i=1;i<=5;i++)
	 {
		 for (int j=4;j>=i;j--)
		 {
			System.out.print(" ");
		 }
	  for (int k=1;k<=i;k++)
	  {
		  System.out.print("*");
	  }
      	System.out.println();
	 }
 	}
}
