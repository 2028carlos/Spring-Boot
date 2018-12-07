package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class TrabajadorController {
//	@Autowired
//TrabajadorService trabajadorservice;
	
	@RequestMapping(value="/trabajador",method = RequestMethod.GET, headers = "Accept=application/json")
	public String citasController(Model model){
		
//   List listaTrabajador =trabajadorservice.getAllTrabajador();
//		model.addAttribute("Trabajador", new Trabajador());	
//	model.addAttribute("listaTrabajador",listaTrabajador);

	return "Trabajador"; // 
}
	
}
