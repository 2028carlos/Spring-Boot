package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;






@Controller

public class ServicioController {
//	@Autowired
// ServicioService servicio;

	
	@RequestMapping(value="/servicio",method = RequestMethod.GET, headers = "Accept=application/json")
	public String inicio(Model model){
		
//   List listaServicio =servicio.getAllServicio();
//		model.addAttribute("servicio", new Servicio());	
//	model.addAttribute("listaServicio",listaServicio);

	return "Servicio"; // 
}
	
	

//	
//
//	@RequestMapping(value = "/registraServicio", method = RequestMethod.POST, headers = "Accept=application/json")
//	public String addPerson(@ModelAttribute("person") Servicio person) {	
//		if(person.getServicioid() == null || person.getServicioid()==0)
//		{
//			servicio.registroServicio(person);
//		}
//		else
//		{	
//			servicio.ActualizaServicio(person);
//		}
// 
//		return "redirect:/servicio";
//	}

	
//	@RequestMapping(value = "/eliminarServicio", method = RequestMethod.POST, headers = "Accept=application/json")
//	public String eliminarServicio(@ModelAttribute("person") Servicio person) {	
//		
//			servicio.EliminarServicio(person);
//	
// 
//		return "redirect:/servicio";
//	}

	
//	@RequestMapping(value = "/eliminarServicio/{id}", method = RequestMethod.POST, headers = "Accept=application/json")
//	public Servicio getPersonById(@PathVariable int id) {
//		Servicio s;
//		return servicio.EliminarServicio(id);
//	}
	
	
	
	
}
