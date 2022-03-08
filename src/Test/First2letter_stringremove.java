package Test;

public class First2letter_stringremove 
{
	  
    public static String
    
    remove(String str)
    {
    	if(str.length() != 'h' || 'g')
    	{
        str = str.substring(2, str.length());
        return str;
    	}
    	else
    	{
    		
    	}
    }

	public static void main(String[] args)
    {
		 
        String str = "Harish";
  
        System.out.print(remove(str));
    }
	

}
