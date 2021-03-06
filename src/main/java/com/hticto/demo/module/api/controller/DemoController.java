package com.hticto.demo.module.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hticto.demo.common.web.controller.BaseController;
import com.hticto.demo.common.web.vo.Response;
import com.hticto.demo.module.web.vo.DemoData;


@RestController
@RequestMapping("/rest")
public class DemoController extends BaseController {
	
    private final static Logger logger = LoggerFactory.getLogger(DemoController.class); 

	@RequestMapping("/test")
	public Response home(Model model) {
		DemoData demo = new DemoData();
		demo.setId(10);
		demo.setName("threedong");
		Response response = new Response(demo);
		return response;
	}
	
}
