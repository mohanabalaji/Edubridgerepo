package threads;

class M1 extends Thread
{
	Synchronize s;
	
	M1(Synchronize s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(2000);
	}
}

class M2 extends Thread
{
	Synchronize s;
	
	M2(Synchronize s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(1500);
	}
}

class M3 extends Thread
{
	Synchronize s;
	
	M3(Synchronize s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(1000);
	}
}

class M4 extends Thread
{
	Synchronize s;
	
	M4(Synchronize s)
	{
		this.s=s;
		start();
	}
	public void run()
	{
		s.deposit(500);
	}
}

public class Synchronize 
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
		Synchronize s=new Synchronize();
		System.out.println(s);
		new M1(s);
		new M2(s);
		new M3(s);
		new M4(s);
	}

}
