package com.hticto.demo.common.web.exception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController {

	@RequestMapping("/404")
	public String catchException() {
		return "404";
	}

	@RequestMapping("/500")
	public String showServerError() {
		return "500";
	}
}
