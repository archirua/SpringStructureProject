package com.archirua.common.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {
	
	/*
	 * CommonServletAop 에서 이미 model 에 대하여 설정 하였으므로 별도의 작업 없이 진행 ( request 에 대하여 작업하지 않는다. )
	 * 페이지에서는 request 를 사용하지 않고 ModelAndView 를 이용한 편집 권장
	 * servlet 별로 추가 작업이 필요할 경우에 한하여 작성
	 */
	@RequestMapping("/greeting")
    public String greeting(Model model) {
        //System.out.println("model :" + model.toString() );
        return "greeting";
    }

}