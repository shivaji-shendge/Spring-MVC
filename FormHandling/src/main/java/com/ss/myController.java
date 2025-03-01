package com.ss;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class myController {
@RequestMapping("/")
public String home() {
	return "register";
}

//@RequestMapping(value="/save",method=RequestMethod.GET)
//public String acceptData(HttpServletRequest request,Map<String,String> map) {
//	String name= request.getParameter("name");
//	String email= request.getParameter("email");
//	String contact= request.getParameter("contact");
//    map.put("Name", name);
//    map.put("Email", name);
//    map.put("Contact", name);
//
//	return "welcome";
//	
//}

@RequestMapping(value="/save",method=RequestMethod.GET)
public String acceptData(Register register, Map<String,Register> map) {
	map.put("reg", register);
	return "welcome";
	
}

}
