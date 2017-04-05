package com.xxt.transaction.dao;

public interface AccountDao {
	public void out(String name,int money);
	public void in(String name,int money);
}
