package com.ss;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
}
