package com.cg.pojo;
//This class maintains the Customer details of a bank.
//It extends the Customer and just calls the parent class constructor using super keyword.

import java.time.LocalDate;

import com.cg.customer.pojo.Customer;


public class MMBankCustomer extends Customer {

	public MMBankCustomer(String customerName, long contactNumber, String dateOfBirth, String permanentAddress,
			String nationality, String gender) {
		super(customerName, contactNumber, dateOfBirth, permanentAddress, nationality, gender);
	}

}
