package com.concretepage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class PrincipalController {
//	@Autowired
//	CitaService citaservice;
//	
	@RequestMapping(value="/principal")
	public String inicio(Model model){
		
		//Es similiar al request en el servlet
		//request.setAtribute();
		//model.addAttribute("login", new Login());
		
		//Segun el spring
		//person ----> /WEB-INF/views/person.jsp
		return "Principal"; // 
	}
	

		
		
		
//
//		@RequestMapping(value = "/registraCita", method = RequestMethod.POST, headers = "Accept=application/json")
//		public String addCita(@ModelAttribute("person") Cita person) {	
////			if(person.getCitaid() == null || person.getCitaid()==0)
////			{
//				citaservice.registroCita(person);
////			}
////			else
////			{	
////				//servicio.ActualizaServicio(person);
////			}
//	 
//			return "redirect:/principal";
//		}
}
