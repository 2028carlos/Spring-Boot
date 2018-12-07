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
public class RolesController {
//	@Autowired
//	RolesService rolesService;
	
	@RequestMapping(value = "/ListarRoles", method = RequestMethod.GET, headers = "Accept=application/json")
	public String Listar(Model model) {
 
//		List listOfRoles = rolesService.ListarRoles();
//		model.addAttribute("roles", new Roles());
//		model.addAttribute("listOfRoles", listOfRoles);
		return "rolesDetails";
	}
// 
//	@RequestMapping(value = "/BuscarRoles/{rolesid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public Roles getRolesById(@PathVariable int rolesid) {
//		return rolesService.BuscarRoles(rolesid);
//	}
// 
//	@RequestMapping(value = "/GuardarRoles", method = RequestMethod.POST, headers = "Accept=application/json")
//	public String addRoles(@ModelAttribute("roles") Roles roles) {	
//		if(roles.getRolesid() == null || roles.getRolesid()==0)
//		{
//			rolesService.GuardarRoles(roles);
//		}
//		else
//		{	
//			rolesService.updateRoles(roles);
//		}
// 
//		return "redirect:/ListarRoles";
//	}
// 
//	@RequestMapping(value = "/updateRoles/{rolesid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String updateRoles(@PathVariable("rolesid") int rolesid, Model model) {
//		model.addAttribute("roles", this.rolesService.BuscarRoles(rolesid));
//		List listOfRoles = rolesService.ListarRoles();
//		model.addAttribute("listOfRoles", listOfRoles);
//		return "rolesDetails";
//	}
// 
//	@RequestMapping(value = "/deleteRoles/{rolesid}", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String deleteRoles(@PathVariable("rolesid") int rolesid) {
//		rolesService.deleteRoles(rolesid);
//		return "redirect:/ListarRoles";
// 
//	}	
}
