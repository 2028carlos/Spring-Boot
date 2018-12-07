package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class ItinerarioController {
//	@Autowired
//	ItinerarioService itinerarioService;
	
	@RequestMapping(value = "/ListarItinerario", method = RequestMethod.GET, headers = "Accept=application/json")
	public String Listar(Model model) {
 
//		List listOfItinerario = itinerarioService.ListarItinerario();
//		model.addAttribute("itinerario", new Itinerario());
//		model.addAttribute("listOfItinerario", listOfItinerario);
		return "itinerarioDetails";
	}
// 
//	@RequestMapping(value = "/BuscarItinerario/{itinerarioid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public Itinerario getItinerarioById(@PathVariable int itinerarioid) {
//		return itinerarioService.BuscarItinerario(itinerarioid);
//	}
// 
//	@RequestMapping(value = "/GuardarItinerario", method = RequestMethod.POST, headers = "Accept=application/json")
//	public String addItinerario(@ModelAttribute("itinerario") Itinerario itinerario) {	
//		if( itinerario.getItinerarioid()==0)
//		{
//			itinerarioService.GuardarItinerario(itinerario);
//		}
//		else
//		{	
//			itinerarioService.updateItinerario(itinerario);
//		}
// 
//		return "redirect:/ListarItinerario";
//	}
// 
//	@RequestMapping(value = "/updateItinerario/{itinerarioid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String updateItinerario(@PathVariable("itinerarioid") int itinerarioid, Model model) {
//		model.addAttribute("itinerario", this.itinerarioService.BuscarItinerario(itinerarioid));
//		List listOfItinerario = itinerarioService.ListarItinerario();
//		model.addAttribute("listOfItinerario", listOfItinerario);
//		return "itinerarioDetails";
//	}
// 
//	@RequestMapping(value = "/deleteItinerario/{itinerarioid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String deleteItinerario(@PathVariable("Itinerarioid") int itinerarioid) {
//		itinerarioService.deleteItinerario(itinerarioid);
//		return "redirect:/ListarItinerario";
// 
//	}	
}
