package wordsearch;

public class wordsearch
{

	public static void main(String[] args) 
	{
		String str= "Hello readers";
		int Index = str.indexOf("Hello");
		if(Index == - 1) 
		{
			System.out.println("Hello not found!");
		} 
		else 
		{
			System.out.println("Found hello of index "+ Index);
		}
	}

}
