package com.qnx.springmvc;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String mainMenu(Model model) {
		Student s=new Student();
		model.addAttribute("s",s);
		return "main-menu";
	}
	@RequestMapping("/displayName")
	public String displayName(@ModelAttribute("s")Student s) {
		return "display-menu";
	}
	
	
	

}
