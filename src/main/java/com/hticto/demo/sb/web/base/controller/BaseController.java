package com.hticto.demo.sb.web.base.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/api")
public class BaseController {
	
	
	@Value("${test.msg}")
	protected String env;

}
