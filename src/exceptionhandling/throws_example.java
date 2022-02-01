package exceptionhandling;

import java.io.BufferedReader;

public abstract class throws_example
{
	public void m() throws IOException , RemoteException, Exception
	{
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader brr=new BufferedReader(r);
		
		System.out.println("enter input");
		  String name=brr.readLine();
		  
		  int x=Integer.parseInt(name);
		  
		  System.out.println();
	}

	public static void main(String[] args) 
	{
		

	}

}
