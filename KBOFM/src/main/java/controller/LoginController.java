package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;

@Controller
public class LoginController {
	
	
	@RequestMapping("user/login/signIn")
	public String newUser() {
		
	
		
		return ViewPath.LOGIN +"signIn.jsp";
	} 
	

	
	

}
