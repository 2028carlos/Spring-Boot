package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Pacientes;
import com.concretepage.service.IPacienteService;







@Controller
public class PacienteController {

	@Autowired
	private IPacienteService pacieneservice;
	
	@GetMapping("article/{id}")
	public ResponseEntity<Pacientes> getArticleById(@PathVariable("id") Integer id) {
		Pacientes article = pacieneservice.getArticleById(id);
		return new ResponseEntity<Pacientes>(article, HttpStatus.OK);
	}
	
	
	@GetMapping("articles")
	public ResponseEntity<List<Pacientes>> getAllArticles() {
		List<Pacientes> list = pacieneservice.getAllPacientes();
		
		return new ResponseEntity<List<Pacientes>>(list, HttpStatus.OK);
	}
	
	


	@RequestMapping(path="/paciente",method = RequestMethod.GET)
	public String inicio21(Model model){
		model.addAttribute("paciente", pacieneservice.getAllPacientes());
	return "Paciente"; 
}

	
	@PostMapping("article")
	public ResponseEntity<Void> addArticle(@RequestBody Pacientes article, UriComponentsBuilder builder) {
        boolean flag = pacieneservice.addArticle(article);
        if (flag == false) {
        	return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getPacienteid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@PutMapping("article")
	public ResponseEntity<Pacientes> updateArticle(@RequestBody Pacientes article) {
		pacieneservice.updateArticle(article);
		return new ResponseEntity<Pacientes>(article, HttpStatus.OK);
	}
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		pacieneservice.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}	

}
