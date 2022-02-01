package bankdetails;

public class BankAcc 
{
	String accname;
	String accno;
	private double balance;
 
public  BankAcc(String accname,String accno)
{
	this.accno =accno;
	this.accname=accname;
	balance = 0;
}
public String getaaccname()
{
	return  accname;
}
public String getaccno()
{
	return accno;
}
public Double getbalance()
{
	return balance;
}
public boolean deposit(double amount)
{
	if(amount > 0) 
	{
		balance = balance + amount;
		return true;
	}
	else 
	{
		balance = balance - amount;
		return true;
	}
}
void show()
{
	System.out.println("Accname : " +accname);
	System.out.println("Accno : "    +accno);
	
}
}
