package com.cg.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.cg.bank.dao.OnlineBankDao;
import com.cg.customer.pojo.BankAccount;
import com.cg.customer.pojo.Customer;
import com.cg.pojo.MMBankCurrentAccount;
import com.cg.pojo.MMBankSavingsAccount;

public class MMBankCollection extends OnlineBankDao {
	MMBankCollection bank;

	private static Customer cust1 = new Customer("Nil", 989076543, "03/03/97", "Mumbai", "Indian", "M");
	private static Customer cust2 = new Customer("Nilesh", 987657896, "09/08/1995", "Kolkata", "Indian", "M");
	private static Customer cust3 = new Customer("Ricktika", 989076578, "03/01/96", "Italy", "Italian", "F");
	private static Customer cust4 = new Customer("Vrushika", 987657898, "23/05/1994", "China", "Chinese", "F");

	private static Customer cust5 = new Customer("Ishika", 987657801, "31/12/1998", "Germany", "German", "F");

//	static List<BankAccount> listOfAccountHolders = new ArrayList<BankAccount>();
	private static BankAccount bank1 = new MMBankSavingsAccount(cust1, 50000.00, true, "SavingsNonZeroSalaried");
	private static BankAccount bank2 = new MMBankSavingsAccount(cust2, 60000.00, false, "SavingsNonZeroNonSalaried");
	private static BankAccount bank3 = new MMBankSavingsAccount(cust3, true, "SavingsZeroSalaried");
	private static BankAccount bank4 = new MMBankCurrentAccount(cust4, 90000.00, 10000.00, "Current");
	private static BankAccount bank5 = new MMBankCurrentAccount(cust5, 100000.00, 50000.00, "Current");

	private static Set<BankAccount> listOfAccountHolders;

	static {
		listOfAccountHolders = new HashSet<>();
	}

	static {
		listOfAccountHolders.add(bank1);
		listOfAccountHolders.add(bank2);
		listOfAccountHolders.add(bank3);
		listOfAccountHolders.add(bank4);
		listOfAccountHolders.add(bank5);
	}

	public static void addBankAccount(BankAccount bankAccount) {
//		listOfAccountHolders.add(bank1);
//		listOfAccountHolders.add(bank2);
//		listOfAccountHolders.add(bank3);
//		listOfAccountHolders.add(bank4);
//		listOfAccountHolders.add(bank5);

	}

	public static Set<BankAccount> viewAll() {
		System.out.println(bank1);
		return listOfAccountHolders;

	}

	public static List<Customer> viewCustomerOnly() {
		List<Customer> listOfCustomer = new ArrayList<Customer>();
		for (BankAccount s : viewAll()) {
			listOfCustomer.add(s.getAccountHolder());
		}
		return listOfCustomer;

	}

	public double deposit(int accountToBeDeposited, double amount) {
		System.out.println(accountToBeDeposited);
		for (BankAccount b : viewAll()) {
			System.out.println("for"+b.getAccountNumber());
			if (b.getAccountNumber() == accountToBeDeposited) {
				
				b.deposit(amount);
				return amount;
			}
			//else return 0.0;
		
		}
		return 0.0;
	}

	public double withdraw(int accountToBeWithdrawn, double amount) {
		System.out.println(accountToBeWithdrawn);
		for (BankAccount b : this.viewAll()) {
			System.out.println("for"+b.getAccountNumber());
			if ((b.getAccountNumber() == accountToBeWithdrawn)) {
							if(b.withdraw(amount)!=-1)
							{
							return amount;
							}
							

							
			}
//			else 
//				return -1;
		}
		return -1;
	}

	public void removeAccountByAccountNumber(int accountNumber) {
		for (BankAccount b : viewAll()) {
			if ((b.getAccountNumber() == accountNumber)) {
				viewAll().remove(accountNumber);

			}
		}
	}

	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
		System.out.println("dghsdghfg");
		System.out.println(this.viewAll());
		for (BankAccount bankAccount : viewAll()) {
			if (bankAccount.getAccountNumber() == accountToBeSearched) {
				return bankAccount;
			}
		}
		return null;
	}

	public void performFundTransfer(int senderNo, int receiverNo, double amount) {
		for (BankAccount rec : viewAll())
			if (rec.getAccountNumber() == receiverNo) {
				for (BankAccount sender : viewAll()) {
					if (sender.getAccountNumber() == senderNo) {
						sender.deposit(rec.withdraw(amount));
					}
				}
			}
	}
}
