package bankdetails;

public class CheckAcc extends SavingsAcc
{
	
	private int transactioncount;
	private static final int Num_free=3;
	private static final double Trans_fee = 2.0;
	
	
	public CheckAcc(String accname, String accno,double rate)
	{
		super(accname, accno,rate );
		transactioncount = 0;
	}
	public boolean deposit(double amount)
	{
		if(super.deposit(amount))
		{
			transactioncount++;
			return true;
		}else 
		{
			return false;
		}
	}
	public boolean withdraw(double amount) 
	{
		if(super.withdraw(amount))
		{
			transactioncount++;
			return true;
		}else 
		{
			return false;
		}
	}
	public void deductfee() 
	{
		if(transactioncount > Num_free)
		{
			double fees = Trans_fee *(transactioncount - Num_free);
			
		if(super.withdraw(fees))
		{
			transactioncount = 0;
		}
		}
	}

	public static void main(String args[]) 
	{
		CheckAcc c = new CheckAcc("Mohana balaji","221709387",4);
		c.show();
		c.deposit(1000);
		System.out.println("before interest " +c.getbalance());
		c.addInterest();
		System.out.println("after interest " +c.getbalance());
		c.withdraw(200);
		System.out.println("withdraw "+c.getbalance());
		c.deposit(500);
		c.withdraw(200);
		c.deposit(700);
		c.deductfee();
		System.out.println("Transaction" +c.getbalance());
	}
}