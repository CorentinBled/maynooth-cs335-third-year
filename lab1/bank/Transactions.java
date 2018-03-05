package Bank;
import javax.swing.JOptionPane;

/**
 * This class consists of GUI needed for the user to update their account from an atm
 * It uses methods from the BankAccount class
 * @author u180301
 * @version 1.0
 * @since 05 Feb 2018
 */

public class Transactions
{
	public int answer1,answer2,amount;
	public boolean withdrawOK = true;
	public BankAccount ba;
    
	/**
	 * Sets initial bank account value to 1000
	 */
	public Transactions() {
    	answer1=0;
    	answer2=0;
    	amount=0;
    	ba = new BankAccount(1000);
    	
    }
    
	/**
	 * Main method creates a new transaction
	 * Takes in the user transaction input using the input method and
	 * closes the input
	 * @param args
	 */
	public static void main(String[] args)
	{
	  Transactions transaction = new Transactions();
	  transaction.getInput();
	  System.exit(0);
		  
	  }
	   
	/**
	 * Creates the GUI the user uses to complete a transaction to make either a deposit or withdrawal
	 */
   public void getInput() {	   
	   answer1 = JOptionPane.showConfirmDialog(null,
	                "Make a Depoist?", null, JOptionPane.YES_NO_OPTION);
	     
	   if (answer1 == JOptionPane.YES_OPTION){
	    	  String depString =
	    		         JOptionPane.showInputDialog(
	    		                               "Enter amount:");
	    	  amount = Integer.parseInt(depString);
	    	 
	    	  BankAccount.deposit(amount);
	    	
	    		     
	      }
	   
	   else if (answer1 == JOptionPane.NO_OPTION){
		   answer2 = JOptionPane.showConfirmDialog(null,
	                "Make a Withdraw?", null, JOptionPane.YES_NO_OPTION);
	   
		   if (answer2 == JOptionPane.YES_OPTION){
		    	  String withString =
		    		         JOptionPane.showInputDialog(
		    		                               "Enter amount:");
		    	  amount = Integer.parseInt(withString);
		    	  
		    	  BankAccount.withdraw(amount);
		    	  
	   
	   }
		 
			
	   }
	   if (!withdrawOK)
		   JOptionPane.showMessageDialog(
			         null, "Your Balance  = " + ba.getBalance()+ " which is not enough for this withdraw ");
	   else
		   JOptionPane.showMessageDialog( 
				     null, " Your balance is " + ba.getBalance());

		      	   
	      }
}

