package com.qnx.springmvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}
	@RequestMapping("/displayName")
	
	public String displayName(HttpServletRequest request, Model model) {
		String name=request.getParameter("studentName");
	
		name=name.toUpperCase();
		model.addAttribute("mname",name);
		return "display-menu";
	}
	
	
	

}
