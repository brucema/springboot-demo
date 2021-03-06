package com.hticto.demo.module.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hticto.demo.common.web.controller.BaseController;
import com.hticto.demo.module.service.iface.DemoService;

@Controller
@RequestMapping("/ftl")
public class FreemarkerController extends BaseController {
	
	@Autowired
	private DemoService demoService;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome(Model model, @RequestParam(required=true) int id) {
		Map<String, Object> map = new HashMap<String, Object>();
		String message = demoService.getMessage(id);
		map.put("time", new Date());
		map.put("message", message);
		map.put("env", env);
		model.addAllAttributes(map);
		return "welcome";
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String welcome(Model model) {
		Map<String, Object> map = new HashMap<String, Object>();
		String message = demoService.getMessage();
		map.put("time", new Date());
		map.put("message", message);
		map.put("env", env);
		model.addAllAttributes(map);
		return "welcome-test";
	}
	
	
}
