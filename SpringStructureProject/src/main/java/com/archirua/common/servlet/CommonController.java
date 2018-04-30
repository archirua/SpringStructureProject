package com.archirua.common.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommonController {

	@RequestMapping("/greeting")
    public String greeting(Model model) {		
        System.out.println("model :" + model.toString() );
        return "greeting";
    }

}