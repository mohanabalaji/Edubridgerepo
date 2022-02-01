package bankdetails;

public class SavingsAcc extends BankAcc
{
		 private double interestrate;
		String accname,accno;
		
	public SavingsAcc(String accname, String accno,double rate) 
	{
			super(accname, accno);
			interestrate =rate;
	}
	public void addInterest()
	{
			double interest = getbalance() + interestrate/100;
			deposit(interest);
	}
	public boolean withdraw(double fees) {
		// TODO Auto-generated method stub
		return false;
	}	
		
		
}
