package com.xxt.transaction.service.impl;

import com.xxt.transaction.dao.AccountDao;
import com.xxt.transaction.service.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	

	@Override
	public void trans(final String outer, final String inner, final int money) {
		
				accountDao.out(outer, money);
//				int i=1/0;
				accountDao.in(inner,money);
				
		
	}


}
