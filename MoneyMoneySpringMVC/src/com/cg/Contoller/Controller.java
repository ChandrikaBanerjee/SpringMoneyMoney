package com.cg.Contoller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.service.MoneyMoneyBankService;

@org.springframework.stereotype.Controller

public class Controller {
	MoneyMoneyBankService service = new MoneyMoneyBankService();
	
@RequestMapping("search")
public String search(@RequestParam("searchAccount") int accountToBeSearched,Model model)
{
	service.getAccountByAccountNumber(accountToBeSearched);

	model.addAttribute("search", service.getAccountByAccountNumber(accountToBeSearched));
	return "viewAllCustomers";
	
}

@RequestMapping("searchA")
public String searchAccount(){
	return "searchAccount";
	
}

}
