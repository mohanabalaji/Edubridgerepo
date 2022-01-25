package abcd;

import java.util.*;

public class two_abcd {

	public static void main(String[] args) 
	{
	
		 int i,j,n,k=1;
		 Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the no of lines: ");
		 n=sc.nextInt();
		     System.out.println("Floyd's Triangle using alphabets: ");
		     for(i=1;i<=n;i++)
		     {
		        for(j=1;j<=i;j++,k++)
		         {
		             System.out.printf("%4c",(char)(k+64));
		         }
		 
		         System.out.println("");
		     }
	}

}
