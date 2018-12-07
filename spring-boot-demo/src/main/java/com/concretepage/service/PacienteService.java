package com.concretepage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.concretepage.entity.Pacientes;
import com.concretepage.repository.PacienteRepository;





@Service
public class PacienteService implements IPacienteService  {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	

	@Override
	public Pacientes getArticleById(long pacienteid) {
		// TODO Auto-generated method stub
		Pacientes obj = pacienteRepository.findById(pacienteid).get();
		return obj;
	}

	@Override
	public List<Pacientes> getAllPacientes() {
		List<Pacientes>listPaciente =  new ArrayList<>();
		pacienteRepository.findAll().forEach(e -> listPaciente.add(e));
		return listPaciente;
	}
	@Override
	public synchronized boolean addArticle(Pacientes pac) {
//		  List<Pacientes> list = pacienteRepository.findByTipodocumentoAndNumdocumentoAndFechacreacionAndApellidoNombreAndTelefonoAndDireccionAndFechanacAndGenero(pac.getTipodocumento(), pac.getNumdocumento(), pac.getFechacreacion(), pac.getNombre(), pac.getApellido(), pac.getTelefono(), pac.getDireccion(), pac.getFechanac(), pac.getGenero());
		 List<Pacientes> list = pacienteRepository.findByTipodocumentoAndNumdocumentoAndFechacreacionAndNombre(pac.getTipodocumento(), pac.getNumdocumento(), pac.getFechacreacion(),pac.getNombre());  
		if (list.size() > 0) {
	    	   return false;
	       } else {
	    	   pacienteRepository.save(pac);
	    	   return true;
	       }
	}

	@Override
	public void updateArticle(Pacientes article) {
		pacienteRepository.save(article);
		
	}

	@Override
	public void deleteArticle(int pacienteid) {
		// TODO Auto-generated method stub
		pacienteRepository.delete(getArticleById(pacienteid));
	}

	
	
	

	
	
	



	
	
	

}
