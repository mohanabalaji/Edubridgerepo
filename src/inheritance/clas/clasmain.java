package inheritance.clas;

public class clasmain extends clas
{

	public static void main(String[] args)
	{
		clas ob=new clas();
		
		ob.show();           // public can access anywhere
		ob.show2();         // defaut access within package
		ob.show3();        // defaut access within package

	}

}
