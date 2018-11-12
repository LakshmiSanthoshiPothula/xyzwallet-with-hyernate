package com.cg.xyzwallet.service;


import com.cg.xyzwallet.bean.AccountBean;

public interface IAccountService {

          public boolean createAccount(AccountBean accountBean) throws  Exception ;
          public AccountBean findAccount(int accountId) throws Exception;
          public boolean deposit(AccountBean accountBean,double depositAmount) throws Exception ;
          public boolean withdraw(AccountBean accountBean,double withdrawAmount) throws Exception;
          public boolean fundTransfer(AccountBean transferingAccountBean, AccountBean beneficiaryAccountBean, double transferAmount) throws Exception ;
         
		 
          
	
}
