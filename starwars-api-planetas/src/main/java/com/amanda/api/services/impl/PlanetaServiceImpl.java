package com.amanda.api.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amanda.api.documents.Planeta;
import com.amanda.api.repositories.PlanetaRepository;
import com.amanda.api.services.PlanetaService;

@Service
public class PlanetaServiceImpl implements PlanetaService {
	
	@Autowired
	private PlanetaRepository planetaRespository;

	@Override
	public List<Planeta> listarTodos() {
		return this.planetaRespository.findAll();
	}

	@Override
	public Planeta listarPorId(String id) {
		return this.planetaRespository.findOne(id);
		
	}
	
	@Override
	public Planeta listarPorNome(String nome) {
		return this.planetaRespository.findOne(nome);
	}
	

	@Override
	public Planeta cadastrar(Planeta planeta) {
		return this.planetaRespository.save(planeta);
	}

	@Override
	public Planeta atualizar(Planeta planeta) {
		return this.planetaRespository.save(planeta);
	}

	@Override
	public void remover(String id) {
		this.planetaRespository.delete(id);
	}

}
