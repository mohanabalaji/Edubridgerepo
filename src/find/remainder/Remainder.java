package find.remainder;

import java.util.Scanner;

public class Remainder 
{

	public static void main(String[] args) 
	{

	      Scanner sc = new Scanner(System.in);
	      System.out.println("How many times you want to try: ");
	      
	      int n= sc.nextInt();
	    		  
	    		  for(int i=0;i<=n;i++)
	    		  {
	    			  System.out.println("enter no 1: ");
	    			   int A= sc.nextInt();
	    			   
	    			   System.out.println("enter no 2: ");
	    			   int B= sc.nextInt();
	    					   
	    		      int T=A%B;
	    			  System.out.println("the result is: ");
	    		  }
	      sc.close();
	    
	}

}
