package com.mobydigitalrrhh.models.services;

import java.util.List;

import com.mobydigitalrrhh.models.entities.*;

public interface IPersonaService {

	public List<Persona> findByPersona();

	public Persona findByDni(Integer dni);

	public void createPersona(Persona persona);

	public void deletePersona(Integer dni);
}
