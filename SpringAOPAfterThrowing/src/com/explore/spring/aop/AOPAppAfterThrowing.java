package com.explore.spring.aop;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.explore.spring.aop.dao.AccountDAO;


public class AOPAppAfterThrowing {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctxt= new AnnotationConfigApplicationContext(AppConfig.class);
		
		AccountDAO accountDAO = ctxt.getBean( "accountDAO",AccountDAO.class);
		
		List<Account> theAccounts = null;
	
		
		try {
			
			accountDAO.findAllAccounts();
		} catch (Exception e) {
			System.out.println("\n \n Main program caught exception: "+e);
		}
		
		System.out.println("Accounts List in AOPAppAfterThrowing : "+theAccounts);
				
		ctxt.close();


	}

}
