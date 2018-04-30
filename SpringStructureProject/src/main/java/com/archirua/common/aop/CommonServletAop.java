package com.archirua.common.aop;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @author achirua 
 */
@Component
@Aspect
public class CommonServletAop {
	
	
	/**
	 * Before Servlet start, add request parameter in Model
	 * @param joinpoint
	 * @throws Throwable
	 */
	@Before("execution(* com.archirua.common.servlet.*.*(..)) ")
	public void doSomthingServlet( JoinPoint  joinpoint ) throws Throwable {		
		System.out.println("++++++++++++++++++++++" );
		System.out.println("ServletAop");
		  
		// request 를 가져온다.
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		
		// join 포인트로부터 View에서 사용할 model 을 가져온다. 
		Object[] obj_arr = joinpoint.getArgs();
		ModelMap model = null;
		for(Object obj : obj_arr) {
			//ModelMap 일 경우 할당
			if( obj instanceof BindingAwareModelMap) {
				model = (ModelMap)obj;
			}
		}
		
		// request로부터 파라미터를 전달 받아 모델에 입력
		// 만약 공통 Validation 및 제외 문자가 필요할 겨우 이곳에서 처리할 수 있지 않을까 ? ( 공통으로 사용함으로 정말 기본적인 값만 제외 ) 
		Enumeration enumParam = request.getParameterNames();		
		while( enumParam.hasMoreElements() ) {
			String key = (String)enumParam.nextElement();
			Object value  = request.getParameter(key);
			model.addAttribute(key, value);
		}
		
		System.out.println("++++++++++++++++++++++" );
	}	
	
}
