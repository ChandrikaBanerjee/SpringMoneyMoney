package com.cg.pojo;

import com.cg.customer.pojo.CurrentAccount;
import com.cg.customer.pojo.Customer;


public class MMBankCurrentAccount extends CurrentAccount
{
	public MMBankCurrentAccount(Customer accountHolder, double accountBalance, double odLimit,String accountType) {
		super(accountHolder, accountBalance, odLimit,accountType);
	}


	
	public double withdraw(double amountToBeWithDrawn) {
		if(this.getAccountBalance()+this.getOdLimit()>amountToBeWithDrawn) {
			this.setAccountBalance(this.getAccountBalance()-amountToBeWithDrawn);
			return amountToBeWithDrawn;
		}
		else
		return -1;
	
		}
	}

