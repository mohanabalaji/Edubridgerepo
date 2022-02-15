package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoDeserialize 
{

	public static void main(String[] args)
	{
		Employee e = null;
		
		try 
		{
			FileInputStream fileIn = new FileInputStream("D:/MyEmployee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee)in.readObject();
			in.close();
			fileIn.close();
			
		} catch(IOException i)
		{
			return;
		} catch (ClassNotFoundException c)
		{
			System.out.println("Employee claass not found");
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: "+ e.getName());
		System.out.println("id: "+ e.getId());

	}

}
