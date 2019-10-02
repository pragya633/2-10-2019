package com.cg.ibs.cardmanagement.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;
import com.cg.ibs.cardmanagement.cardbean.QueryTableBean;
import com.cg.ibs.common.bean.AccountBean;
import com.cg.ibs.common.bean.CustomerBean;
import com.cg.ibs.common.bean.IBSUser;

public class DaoClass  implements CustomerDao , BankDao{

	 
	
		
		
		HashMap<String, AccountBean > Account_Details = new HashMap<String, AccountBean>();

	HashMap<String, CustomerBean> Customer_Details = new HashMap<String, CustomerBean>();	

	HashMap<String, IBSUser> IBSUser = new HashMap<String, IBSUser>();

	HashMap<String, CaseIdBean> Query_Details = new HashMap<String, CaseIdBean>();

	//HashMap<String, QueryTableBean> Query_Type = new HashMap<String, QueryTableBean>();

	HashMap<String, DebitCardBean> Debit_Card_Details = new HashMap<String, DebitCardBean>();
	
	HashMap<String, CreditCardBean> Credit_Card_Details = new HashMap<String, CreditCardBean>();


	
		
		
		
		
	
	
	@Override
	public void newDebitCard(CaseIdBean customIdBean) {
		// TODO Auto-generated method stub
		Query_Details.put(customIdBean.getCaseIdTotal(),customIdBean);
		
	}
}