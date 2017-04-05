package com.xxt.transaction.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xxt.transaction.service.AccountService;

public class Tset {
	@Test
	public void test1(){
		String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		AccountService service= (AccountService)applicationContext.getBean("accountService");
		service.trans("jack", "rose", 1000);
		
	}
}	
