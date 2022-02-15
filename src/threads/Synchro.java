package threads;

class M11 extends Thread
{
	Synchro s;
	
	M11(Synchro s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(1000);
	}
}

class M22 extends Thread
{
	Synchro s;
	
	M22(Synchro s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(500);
	}
}


public class Synchro 
{
	int bal=1000;
	
	synchronized void deposit(int amt)
	{
		int temp = bal;
		temp= temp+amt;
		try {
			   Thread.sleep(1000); 
		    } catch(Exception e) { }
		bal=temp;
		System.out.println("Account Balance= "+bal);
		
	}

	public static void main(String[] args)
	{
		Synchro s=new Synchro();
		System.out.println(s);
		new M11(s);
		
		new M22(s);
	}

}
