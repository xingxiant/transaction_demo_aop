package com.xxt.transaction.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xxt.transaction.service.AccountService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class Tset {
	@Autowired  //��junit���ϣ�����Ҫ��spring xml����ɨ��
	private AccountService accountService;
	@Test
	public void test1(){
		/*String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		AccountService service= (AccountService)applicationContext.getBean("accountService");*/
		accountService.trans("jack", "rose", 1000);
		
	}
}	
