import com.cap.bus.BusiIcici;
import com.ex.cap1.InvalidAccountNumberException;
import com.ex2.cap1.InsufficientBalanceException;

public class Clients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusiIcici bs=new BusiIcici();
	System.out.println(bs.createAccount(102, 2000));
	System.out.println(bs.createAccount(132, 5000));
	System.out.println(bs.createAccount(105, 400));
	try
	{
		System.out.println("balance after withdraw = "+bs.withdraw(102, 500));
		System.out.println("balance after depositing ="+bs.deposit(132, 4000));
		System.out.println("final balance after fund transfer = "+bs.fundTransfer(102,132,500));
		System.out.println("balance after depositing "+bs.deposit(105, 300));
	}
	catch(InvalidAccountNumberException e)
	{
		System.out.println("invalid acc number");
	}
		catch(InsufficientBalanceException o)
	{
			System.out.println("insufficient balance");
	}

	}

}
