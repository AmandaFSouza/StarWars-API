package com.amanda.api.services;

import java.util.List;

import com.amanda.api.documents.Planeta;

public interface PlanetaService {
	
	List<Planeta> listarTodos();
	
	Planeta listarPorId(String id);
	
	Planeta listarPorNome(String nome);
	
	Planeta cadastrar(Planeta planeta);
	
	Planeta atualizar(Planeta planeta);
	
	void remover(String id);

}
