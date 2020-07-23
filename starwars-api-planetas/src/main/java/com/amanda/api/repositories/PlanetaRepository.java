package com.amanda.api.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.amanda.api.documents.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String> {
	
	  
}
