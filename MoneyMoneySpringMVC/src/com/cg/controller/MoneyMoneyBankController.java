package com.cg.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.customer.pojo.BankAccount;
import com.cg.service.MoneyMoneyBankService;

/**
 * Servlet implementation class MoneyMoneyBankController
 */
@WebServlet("*.app")
public class MoneyMoneyBankController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MoneyMoneyBankService service = new MoneyMoneyBankService();
		String action = request.getServletPath();
		HttpSession session = request.getSession();
		System.out.println(action);

		switch (action) {
		case "/search.app":
			int accountToBeSearched = Integer.parseInt(request.getParameter("searchAccount").toString());

//			 System.out.println("Account number : " + accountToSearched2);
			service.getAccountByAccountNumber(accountToBeSearched);
			System.out.println("*********************2");
			session.setAttribute("search", service.getAccountByAccountNumber(accountToBeSearched));
			System.out.println("*********************3");
			response.sendRedirect("viewAccount.jsp");
			break;
		case "/viewAllAccount.app":

			System.out.println("All Accounts : " + service.viewAll());
			session.setAttribute("BankAccounts", service.viewAll());
			response.sendRedirect("viewAllCustomers.jsp");
			break;

		case "/depositForm.app":
			String accountNumber = request.getParameter("accountdep");
			int accountNumber2 = Integer.parseInt(accountNumber);
			session.setAttribute("number", accountNumber2);

			String amountS = request.getParameter("accountamt");
			int amount1 = Integer.parseInt(amountS);
			session.setAttribute("amount", amount1);

			double check = service.deposit(accountNumber2, amount1);
			if (check == 0.0) {
				response.sendRedirect("errorDeposit.jsp");
			} else {
				response.sendRedirect("depositSuccess.jsp");

			}
			break;
		case "/withdraw.app":
			String accountNumberw = request.getParameter("accountwith");
			int accountNumberwd = Integer.parseInt(accountNumberw);
			session.setAttribute("wdnumber", accountNumberwd);

			String amountSw = request.getParameter("accountamount");
			int amountwt = Integer.parseInt(amountSw);
			session.setAttribute("wdamount", amountwt);

		check = service.withdraw(accountNumberwd, amountwt);
		
		BankAccount bankAccount=service.getAccountByAccountNumber(accountNumberwd);
		System.out.println(bankAccount.getAccountBalance());
		
		System.out.println("Check:"+check);
			if (check== -1) {
				response.sendRedirect("errorWithdraw.jsp");
			} else {

				response.sendRedirect("withdrawSuccess.jsp");

			}
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
