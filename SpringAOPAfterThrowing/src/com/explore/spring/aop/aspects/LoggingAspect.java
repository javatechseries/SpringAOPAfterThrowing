package com.explore.spring.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@AfterThrowing(pointcut="execution(* com.explore.spring.aop.dao.AccountDAO.findAllAccounts(..))",throwing="exc")
	public void afterThrowingFindAllAccountsAdvice(JoinPoint theJoinPoint, Throwable exc) {
		
		String method=theJoinPoint.getSignature().toShortString();
		
		System.out.println("Method name is: "+method);
		
		System.out.println("The exception thrown is : "+exc);
		
	}
	
	
}
