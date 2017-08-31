package com.hticto.demo.sb.web.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hticto.demo.sb.service.iface.DemoService;
import com.hticto.demo.sb.web.base.controller.BaseController;

@Controller
@RequestMapping("/demo")
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
