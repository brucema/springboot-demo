package com.hticto.demo.module.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hticto.demo.module.web.base.controller.BaseController;
import com.hticto.demo.module.web.vo.DemoData;


@RestController
@RequestMapping("/demo")
public class DemoController extends BaseController {
	
    private final static Logger logger = LoggerFactory.getLogger(DemoController.class); 

	@RequestMapping("/getData")
	DemoData home() {
		DemoData demo = new DemoData();
		demo.setId(10);
		demo.setName("threedong");
		return demo;
	}
	
}
