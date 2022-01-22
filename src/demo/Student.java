package demo;
class room
{
	public
	        int sid;
        	String name;
	        float marks;
	        
	       void setdata()
	       {
	    	   sid=01;;
	    	   marks=99.99F;
	    	   name="Harish";
	    			   
	       }
	       void setdata2()
	       {
	    	   sid=02;
	    	   name="Bala";
	    	   marks=56.93F;
	    			   
	       }
	       void getdata()
	       {
	    	   System.out.println("student id:"+sid);
	    	   System.out.println("student name:"+name);
	    	   System.out.println("student mark:"+marks);
	       }
	       
	      
	    Contructor room()
	       {
	    	  sid=34;
	    	   name=" gh";
	    	   marks=0.0F;
	    	   System.out.println("success!!!");
	       }
}
public class Student 
{
   public static void main(String[] args)
	{
	   room r1=new room();
	   room r2=new room();
	 
	   r1.setdata();
	   r1.getdata();
	   r2.setdata2();
	   r2.getdata();
    }

} 