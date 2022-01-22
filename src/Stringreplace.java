package stringprogram;

public class Stringreplace
{

	public static void main(String[] args) 
	{
	
				String str="HI!, How are you?";
				System.out.println("Before replacement:"+str);
				
				String str2="how you are";
			    str=str.replace(str, str2);
			
				System.out.println("after replacement:"+str);
			
	}

}
