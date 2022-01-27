package abstraction_demo;

public class Absmain 
{

	public static void main(String[] args)
	{
		Shape cir;
		
		cir=new circle();
		cir.show(null);
		cir.area(2, 8);
		
		cir=new Sphare();
		cir.volume(2, 67, 4);
		
		

	}

}
