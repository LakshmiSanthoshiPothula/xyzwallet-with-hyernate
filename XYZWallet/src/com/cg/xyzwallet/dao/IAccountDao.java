package com.cg.xyzwallet.dao;

import com.cg.xyzwallet.bean.AccountBean;

public interface IAccountDao {


    public boolean createAccount(AccountBean accountBean) throws Exception ;
    public boolean updateAccount(AccountBean accountBean) throws Exception;
    public AccountBean findAccount(int accountId) throws Exception;
  
  
	
	 
    
}
