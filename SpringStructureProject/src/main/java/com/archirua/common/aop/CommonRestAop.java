package com.archirua.common.aop;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Component
@Aspect
public class CommonRestAop {
	
	@Before("execution(* com.archirua.common.rest.*.*(..))")
	public void doSomthingRest( JoinPoint joinpoint ) {
		System.out.println("RestAop");
	}
	
}
