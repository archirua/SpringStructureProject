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
		  
		// request �� �����´�.
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		
		// join ����Ʈ�κ��� View���� ����� model �� �����´�. 
		Object[] obj_arr = joinpoint.getArgs();
		ModelMap model = null;
		for(Object obj : obj_arr) {
			//ModelMap �� ��� �Ҵ�
			if( obj instanceof BindingAwareModelMap) {
				model = (ModelMap)obj;
			}
		}
		
		// request�κ��� �Ķ���͸� ���� �޾� �𵨿� �Է�
		// ���� ���� Validation �� ���� ���ڰ� �ʿ��� �ܿ� �̰����� ó���� �� ���� ������ ? ( �������� ��������� ���� �⺻���� ���� ���� ) 
		Enumeration enumParam = request.getParameterNames();		
		while( enumParam.hasMoreElements() ) {
			String key = (String)enumParam.nextElement();
			Object value  = request.getParameter(key);
			model.addAttribute(key, value);
		}
		
		System.out.println("++++++++++++++++++++++" );
	}	
	
}
