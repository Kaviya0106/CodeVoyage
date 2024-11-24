package com.qnx.springmvc;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String mainMenu() {
		return "main-menu";
	}
	@RequestMapping("/displayName")
	public String displayName(@RequestParam("studentName")String name,Model model) {
		//String name=@RequestParam("studentName")
		name="Hello"+ name+", Welcome";
		model.addAttribute("mname",name);
		return "display-menu";
	}
	
	
	

}
