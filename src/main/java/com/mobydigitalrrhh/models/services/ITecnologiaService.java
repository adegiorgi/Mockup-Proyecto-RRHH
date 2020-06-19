package com.mobydigitalrrhh.models.services;

import java.util.List;

import com.mobydigitalrrhh.models.entities.Tecnologia;

public interface ITecnologiaService {

	public List<Tecnologia> findByTecnologia();

	public Tecnologia findByName(String nombre);

	public void createTecnologia(Tecnologia tecnologia);

	public void deleteTecnologia(String nombre);
}
