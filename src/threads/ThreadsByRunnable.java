package threads;

public class ThreadsByRunnable 
{
	int time;
	Thread thread;
	
	public ThreadsByRunnable(int time, String name)
	{
		this.time = time;
		thread = new Thread((Runnable) this,name);
		thread.start();
	}
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread());
			
			try 
			{
				Thread.sleep(time);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println(thread.getState());
	}

}
