package com.cg.service;

import java.util.List;
import java.util.Set;

import com.cg.bank.service.OnlineBankService;
import com.cg.customer.pojo.BankAccount;
import com.cg.customer.pojo.Customer;
import com.cg.dao.MMBankCollection;

public class MoneyMoneyBankService extends OnlineBankService{
	static MMBankCollection bankCollection=new MMBankCollection();
	public void addBankAccount(BankAccount bankAccount) {
	bankCollection.addBankAccount(bankAccount);
	}

	public Set<BankAccount> viewAll() {
		return bankCollection.viewAll();

	}

	public static List<Customer> viewCustomerOnly() {
	return	bankCollection.viewCustomerOnly();

	}

	public double deposit(int accountToBeDeposited, double amount) {
		return bankCollection.deposit(accountToBeDeposited, amount);

	}

	public double withdraw(int accountToBeWithdrawn, double amount) {
	return bankCollection.withdraw(accountToBeWithdrawn, amount);
	}

	public void removeAccountByAccountNumber(int accountNumber) {
	bankCollection.removeAccountByAccountNumber(accountNumber);
	}

	public BankAccount getAccountByAccountNumber(int accountToBeSearched) {
return bankCollection.getAccountByAccountNumber(accountToBeSearched);
	}

	public void performFundTransfer(int senderNo, int receiverNo, double amount) {
	bankCollection.performFundTransfer(senderNo, receiverNo, amount);

}
}
