package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import common.ViewPath;
import service.team.TeamService;
import vo.team.TeamVO;

@Controller
public class LoginController {
	
	private TeamService teamService;
	
	public LoginController(TeamService teamService) {
		this.teamService = teamService;
	}
	
	
	@RequestMapping("user/login/signIn")
	public String newUser(Model model) {
		
		List<TeamVO> teamList = teamService.teamSelect();
		
		
		model.addAttribute("teamList", teamList);
		
		return ViewPath.LOGIN +"signIn.jsp";
	} 
	

	
	

}
