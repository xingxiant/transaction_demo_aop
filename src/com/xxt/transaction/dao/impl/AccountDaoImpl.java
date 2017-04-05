package com.xxt.transaction.dao.impl;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.xxt.transaction.dao.AccountDao;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

	@Override
	public void out(String name, int money) {
		this.getJdbcTemplate().update("update account set money = money-? where username=?",money ,name);
		
	}

	@Override
	public void in(String name, int money) {
		
		this.getJdbcTemplate().update("update account set money = money+? where username=?",money ,name);
	}

}

