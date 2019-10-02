package com.cg.ibs.cardmanagement.service;

import java.math.BigInteger;
import java.util.Date;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.dao.CustomerDao;
import com.cg.ibs.cardmanagement.dao.DaoClass;
import com.cg.ibs.common.bean.TransactionBean;

public class CustomerServiceImpl implements CustomerService{
	
	long caseIdGenTwo=0;
	String caseIdGenOne=" ";
	  String caseIdTotal=" ";
	private CustomerDao customerDao;
	public CustomerServiceImpl(){
		customerDao=new DaoClass ();
	}
	CaseIdBean caseIdObj= new CaseIdBean();
	CustomerServiceImpl customService = new CustomerServiceImpl();
	
	
	 String addToQueryTable(String caseIdGenOne) {
			caseIdTotal = caseIdGenOne+caseIdGenTwo;
			caseIdGenTwo++;
			return caseIdTotal;
			}
	 
	 
	@Override
	public void applyNewDebitCard() {
		// TODO Auto-generated method stub
		caseIdGenOne="ANDC";
		caseIdObj.setCaseIdTotal(customService.addToQueryTable(caseIdGenOne));
		
		 customerDao.newDebitCard(caseIdObj);
		     
		
		
	}
	@Override
	public void applyNewCreditCard(int creditScore, String incomeTaxReturns) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resetCreditPin(BigInteger creditCardNumber, long currentCreditPin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void resetDebtitPin(BigInteger debitCardNumber, long currentDebitPin) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestDebitCardLost(BigInteger debitCardNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestCreditCardLost(BigInteger creditCardNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestDebitCardUpgrade(BigInteger debitCardNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void requestCreditCardUpgrade(BigInteger creditCardNumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public TransactionBean showDebitCardStatement(Date fromDate, Date toDate, BigInteger debitCardNumber) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void raiseDebitMismatchTicket(BigInteger debitCardNumber, BigInteger transactionId) {
		// TODO Auto-generated method stub
		
	}

}
 