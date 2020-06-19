package com.mobydigitalrrhh.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobydigitalrrhh.models.dao.IPersonaDAO;
import com.mobydigitalrrhh.models.entities.Persona;

@Service
public class PersonaServiceImp implements IPersonaService {

	@Autowired
	private IPersonaDAO personaDAO;

	@Override
	public List<Persona> findByPersona() {
		return (List<Persona>) personaDAO.findAll();
	}

	@Override
	public Persona findByDni(Integer dni) {
		return personaDAO.findById(dni).orElse(null);
	}

	@Override
	public void createPersona(Persona persona) {
		personaDAO.save(persona);
	}

	@Override
	public void deletePersona(Integer dni) {
		personaDAO.deleteById(dni);

	}

}
