package com.concretepage.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {

	

	@RequestMapping(value="/login",method = RequestMethod.GET, headers = "Accept=application/json")
	public String inicio(Model model){
		
 
		//model.addAttribute("paciente", new Paciente());	
	//model.addAttribute("listaPaciente",listaPaciente);

	return "Login"; // 
}
	
}
