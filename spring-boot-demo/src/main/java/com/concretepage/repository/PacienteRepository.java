package com.concretepage.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


import com.concretepage.entity.Pacientes;

public interface PacienteRepository extends CrudRepository<Pacientes, Long> {
	
	
	    List<Pacientes> findByTipodocumentoAndNumdocumentoAndFechacreacionAndNombre(String tipodocumento, String numdocumento,String fechacreacion,String nombre
	    		);
}

//List<Pacientes> findByNombreAndApellido(
//		String nombre, String  apellido );