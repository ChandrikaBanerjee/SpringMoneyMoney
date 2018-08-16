package com.cg.Contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.service.MoneyMoneyBankService;

@org.springframework.stereotype.Controller

public class Controller {
	MoneyMoneyBankService service = new MoneyMoneyBankService();
	
@RequestMapping("search)
public String search(@RequestParam("searchAccount") int accountToBeSearched,Model model)
{
//	service.getAccountByAccountNumber(accountToBeSearched);

	model.addAttribute("search", service.getAccountByAccountNumber(accountToBeSearched));
	return "viewAccount";
	
}

@RequestMapping("searchAccount")
public String searchAccount(){
	return "searchAccount";
	
}

@RequestMapping("Home")
public String Home(){
	return "Home";
	
}
@RequestMapping("viewAllAccount")
public String viewAllCustomers(Model model)
{

	

model.addAttribute("BankAccounts", service.viewAll());
return "viewAllCustomers";
}



@RequestMapping("Deposit")
public String deposit()
{
	return "Deposit";
}

@RequestMapping("depositForm")
public String depositSuccess(@RequestParam("accountdep") int accountNumber,@RequestParam("accountamt") double Amount, Model model)
{
	model.addAttribute("number", accountNumber);
	model.addAttribute("amount", Amount);

	double check = service.deposit(accountNumber, Amount);
	if (check == 0.0) {
		return "errorDeposit.jsp";
	}

		return "depositSuccess.jsp";

}

@RequestMapping("withdrawForm")
public String withdrawForm()
{
	return "withdrawForm";
}

@RequestMapping("withdraw")
public String withdrawSuccess(@RequestParam("accountwith") int accountNumber,@RequestParam("accountamount") double Amount, Model model)
{
	model.addAttribute("amountInWithdraw", Amount);
	model.addAttribute("accountInWithdraw", accountNumber);
	
double	check = service.withdraw(accountNumber, Amount);
	
	BankAccount bankAccount=service.getAccountByAccountNumber(accountNumber);
	System.out.println(bankAccount.getAccountBalance());
	
	System.out.println("Check:"+check);
		
	
	if (check == -1) {
		return "errorWithdraw";
	} 
	else
	{

		return "withdrawSuccess";
	}
}

@RequestMapping("fundTransfer")
public String fundTransfer()
{
	return "fundTransfer";
}

@RequestMapping("fundTransferTransact")
public String fundTransferSuccess(@RequestParam("typedFromAccount") int typedFromAccount,@RequestParam("typedToAccount") int typedToAccount,@RequestParam("typedAmount") double typedAmount, Model model)
{
	model.addAttribute("accountInWithdrawTransfer", typedFromAccount);

	model.addAttribute("accountInDepositTransfer", typedToAccount);

	
	model.addAttribute("amountInTransfer", typedAmount);

	
	double  check = service.performFundTransfer(typedToAccount, typedFromAccount, typedAmount);
	if (check != 0.0) {
	
	return "fundTransferSuccess";
	}
}
