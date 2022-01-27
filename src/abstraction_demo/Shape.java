package abstraction_demo;

public abstract class Shape 
{
	

	abstract void area(int x,int y);
	
	abstract void volume (int x, int y, int z);
	
	void show (String msg)
	{
		msg=" shape ";
		
		System.out.println(msg);
       
	}

}
