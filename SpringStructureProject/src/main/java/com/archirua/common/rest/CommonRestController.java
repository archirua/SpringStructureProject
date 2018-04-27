package com.archirua.common.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CommonRestController {
	@RequestMapping("/")
	public String index() {
		return "helloworld!";
	}

}