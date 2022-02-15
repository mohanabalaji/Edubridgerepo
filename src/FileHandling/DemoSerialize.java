package FileHandling;

import java.io.*;

public class DemoSerialize 
{

	public static void main(String[] args) 
	{
		Employee e = new Employee(23,"Bala");
		
		try 
		{
			FileOutputStream fileOut = new FileOutputStream("D:/MyEmployee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			e = (Employee)fileOut.readObject();
			
			fileOut.close();
			
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
