package com.concretepage.service;

import java.util.List;


import com.concretepage.entity.Pacientes;



public interface IPacienteService {

	  List<Pacientes> getAllPacientes();
	  Pacientes getArticleById(long pacienteid);
	     boolean addArticle(Pacientes article);
	     void updateArticle(Pacientes article);
	     void deleteArticle(int pacienteid);
}
