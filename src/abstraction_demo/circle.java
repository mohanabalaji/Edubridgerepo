package abstraction_demo;

public class circle  extends Shape
{

	@Override
	void area(int x, int y) 
	{
	
		
		System.out.print("Area is: "+x +y );
		
	show(null);
		
	}

	@Override
	void volume(int x, int y, int z) 
	{
	
		
	}

	@Override
	void show(String msg)
	{
		msg="message";
		
	}
	

}
