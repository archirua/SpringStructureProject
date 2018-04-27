package com.archirua.common.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CommonRestAop {
	
	@Before("execution(* com.archirua.common.rest.*.*(..))")
	public void doSomthing( JoinPoint joinpoint ) {
		System.out.println("RestAop");
	}	
	
}
