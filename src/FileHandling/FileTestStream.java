package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class FileTestStream 
{

	public static void main(String[] args) 
	{
		try {
			  int bwrite [] = {11,21,3,40,5}; 
			  OutputStream os = new FileOutputStream("D:/MyFiles.txt");
			  for(int x=0; x < bWrite.length ; x++)
			  {
				  os.write(bWrite[x]); //writes the byte
			  }
			 os.close();
			 
			 InputStream is = new FileInputStream("D:/File23.txt");
			  int size = is.available();
			  
			  for(int  i=0; i < size ;i++)
				  System.out.println((char)is.read() + " ");
		    }
		is.close();
	}
	catch(IOException e){
		                 System.out.print("Exception"+e);
		                }
   
}
