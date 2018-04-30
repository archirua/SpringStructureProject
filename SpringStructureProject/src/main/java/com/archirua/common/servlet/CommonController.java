package com.archirua.common.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
	
	/*
	 * CommonServletAop ���� �̹� model �� ���Ͽ� ���� �Ͽ����Ƿ� ������ �۾� ���� ���� ( request �� ���Ͽ� �۾����� �ʴ´�. )
	 * ������������ request �� ������� �ʰ� ModelAndView �� �̿��� ���� ����
	 * servlet ���� �߰� �۾��� �ʿ��� ��쿡 ���Ͽ� �ۼ�
	 */
	@RequestMapping("/greeting")
    public String greeting(Model model) {
        //System.out.println("model :" + model.toString() );
        return "greeting";
    }

}