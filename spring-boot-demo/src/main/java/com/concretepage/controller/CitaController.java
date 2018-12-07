package com.concretepage.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class CitaController {
//	@Autowired
//	CitaService citasservice;
	
	@RequestMapping(value="/citas",method = RequestMethod.GET, headers = "Accept=application/json")
	public String citasController(Model model){
		
//   List listaCita =citasservice.getAllCitas();
//		model.addAttribute("citasActuales", new CitasActuales());	
//	model.addAttribute("listaCita",listaCita);

	return "Citas"; // 
}
	
	
}
